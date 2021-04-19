package com.bookstore.bookstoreservice.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.bookstore.bookstoreservice.APIResponseParser.APIBookInfo;
import com.bookstore.bookstoreservice.APIResponseParser.APIBookItem;
import com.bookstore.bookstoreservice.APIResponseParser.APIResponse;
import com.bookstore.bookstoreservice.model.Book;
import com.bookstore.bookstoreservice.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService {
	
    BookRepository bookRepository;
	private final RestTemplate restTemplate;
	private static final String GOOGLE_BOOKS_API_URL = "https://www.googleapis.com/books/v1/volumes?q=";
	private static final String UNIQUE_API_KEY = "&key=AIzaSyDgPRVxFT6yxGPOIQAiwqqWFpXQKeiTWHY";

    @Autowired
    public BookServiceImpl(BookRepository bookRepository, 
    		RestTemplateBuilder restTemplateBuilder) {
        this.bookRepository = bookRepository;
        this.restTemplate = restTemplateBuilder.build();
    }

    @Override
	public List<Book> searchBookByNameUsingAPI(String bookName) {
		// TODO Auto-generated method stub
		String url = GOOGLE_BOOKS_API_URL + bookName + UNIQUE_API_KEY;
		
        ResponseEntity<APIResponse> response = this.restTemplate.getForEntity(url, APIResponse.class);
        
        if(response.getStatusCode() == HttpStatus.OK && response.getBody().getTotalItems() > 0) {
            List<APIBookItem> bookItems = Arrays.asList(response.getBody().getItems());        
            if(bookItems != null) {
            	return formatAsBookModelList(bookItems);
            }
            return null;
        } else {
            return null;
        }
	}
    
    private List<Book> formatAsBookModelList(List<APIBookItem> foAPIBookItemList) {    	
    	List<Book> booksByName = new ArrayList<>();
    	
    	foAPIBookItemList.forEach(bookItem -> {         		
    		Book book = new Book();
    		APIBookInfo bookInfo = bookItem.getVolumeInfo();
    		
    		book.setBookId(bookItem.getId());
    		book.setBookTitle(bookInfo.getTitle());
    		book.setNoOfCopies(0);
    		book.setAuthors(bookInfo.getAuthors());
    		book.setPublishedDate(bookInfo.getPublishedDate());
    		booksByName.add(book);
    	});
    	return booksByName;
    }

	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		List<Book> allBooks = (List<Book>) bookRepository.findAll();
        return allBooks;
	}

	@Override
	public Book addBook(Book book) {
		// TODO Auto-generated method stub
        return bookRepository.save(book);
	}

	@Override
	public void removeBook(String bookId) {
		// TODO Auto-generated method stub
		bookRepository.deleteById(bookId);
	}

	@Override
	public Book updateBookInventory(Book book) {
		// TODO Auto-generated method stub
		Book bookInDB = bookRepository.findByBookId(book.getBookId());
		bookInDB.setNoOfCopies(book.getNoOfCopies());
		return bookRepository.save(bookInDB);
	}

	@Override
	public List<Book> searchBookByNameInDB(String bookName) {
		// TODO Auto-generated method stub
		return bookRepository.findByBookTitle(bookName);
	}

}

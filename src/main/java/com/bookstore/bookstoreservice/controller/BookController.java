package com.bookstore.bookstoreservice.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookstore.bookstoreservice.model.Book;
import com.bookstore.bookstoreservice.services.BookService;

@CrossOrigin("*")
@RestController
@RequestMapping(value = "api")
public class BookController {
	
	@Autowired
    BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }
	
	@GetMapping(value = "{bookName}", produces = "application/json")
	public ResponseEntity<?> getBookByName(@PathVariable(value = "bookName") String bookName) {
        
		ResponseEntity responseEntity;
        try {
        	List<Book> booksInInventory = bookService.searchBookByNameInDB(bookName);
            List<Book> booksOutsideInventory = bookService.searchBookByNameUsingAPI(bookName);
            List<Book> allBooks = new ArrayList<Book>();
            if (!booksInInventory.isEmpty()) {
            	allBooks.addAll(booksInInventory);
            	allBooks.addAll(booksOutsideInventory);
            } else { allBooks = booksOutsideInventory; }
            responseEntity = new ResponseEntity<List<Book>>(allBooks, HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            responseEntity = new ResponseEntity<String>(ex.getMessage(), HttpStatus.NOT_FOUND);
        }
        return responseEntity;
    }
	
	@CrossOrigin(origins = "http://localhost:8080")
	@PostMapping(value = "book", produces = "application/json")
	public ResponseEntity<?> addBook(@RequestBody Book book) {
        
		ResponseEntity responseEntity;
        try {
        	Book savedBook = bookService.addBook(book);
            responseEntity = new ResponseEntity<Book>(savedBook, HttpStatus.CREATED);
        } catch (Exception ex) {
            responseEntity = new ResponseEntity<String>(ex.getMessage(), HttpStatus.BAD_GATEWAY);
        }
        return responseEntity;
	}
	
	@GetMapping(value = "book", produces = "application/json")
	public ResponseEntity<?> getAllBooks() {
		
		List<Book> books = bookService.getAllBooks();
        ResponseEntity responseEntity = new ResponseEntity<List<Book>>(books, HttpStatus.OK);
        return responseEntity;
	}
	
	@PutMapping(value = "book", produces = "application/json")
	public ResponseEntity<?> updateBookInventory(@RequestBody Book book) {
		
        ResponseEntity responseEntity;
        try {
            Book updatedook = bookService.updateBookInventory(book);
            responseEntity = new ResponseEntity<Book>(updatedook, HttpStatus.ACCEPTED);
        } catch (Exception e) {
            responseEntity = new ResponseEntity<String>(e.getMessage(), HttpStatus.UNPROCESSABLE_ENTITY);
        }
        return responseEntity;
	}
	
	@DeleteMapping(value = "book/{bookId}", produces = "application/json")
    public ResponseEntity<?> deleteBookbyId(@PathVariable(value = "bookId") String bookId) {

        ResponseEntity responseEntity;
        try {
            bookService.removeBook(bookId);
            responseEntity = new ResponseEntity<String>("Book deleted successfully", HttpStatus.OK);
        } catch (Exception e) {
            responseEntity = new ResponseEntity<String>(e.getMessage(), HttpStatus.NOT_FOUND);
        }
        return responseEntity;
    }
}

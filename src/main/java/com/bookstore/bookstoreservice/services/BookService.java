package com.bookstore.bookstoreservice.services;

import java.util.List;

import com.bookstore.bookstoreservice.model.Book;

public interface BookService {
	
	public List<Book> searchBookByNameUsingAPI(String bookName);
	
	public List<Book> searchBookByNameInDB(String bookName);
	
	public List<Book> getAllBooks();
	
	public Book addBook(Book book);
	
	public Book updateBookInventory(Book book);
	
	public void removeBook(String bookId);
}

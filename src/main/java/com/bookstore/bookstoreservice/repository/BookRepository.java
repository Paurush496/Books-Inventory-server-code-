package com.bookstore.bookstoreservice.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bookstore.bookstoreservice.model.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, String> {

	Book findByBookId(String bookId);
	
	List<Book> findByBookTitle(String bookTitle);
}

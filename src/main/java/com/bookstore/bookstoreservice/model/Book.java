/**
 * 
 */
package com.bookstore.bookstoreservice.model;

import java.util.Arrays;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author User
 *
 */
@Document(collection = "books")
public class Book {
	
	@Id
	String bookId;
	
	String bookTitle;
	String[] authors;
	String publishedDate;
	int noOfCopies;
	
	public Book() {	}
	
	public Book(String bookId, String bookTitle, String[] authors, String publishedDate, int noOfCopies) {
		super();
		this.bookId = bookId;
		this.bookTitle = bookTitle;
		this.authors = authors;
		this.publishedDate = publishedDate;
		this.noOfCopies = noOfCopies;
	}
	
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookTitle=" + bookTitle + ", authors=" + Arrays.toString(authors)
				+ ", publishedDate=" + publishedDate + ", noOfCopies=" + noOfCopies + "]";
	}

	/**
	 * @param bookId the bookId to set
	 */
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}
	/**
	 * @return the bookTitle
	 */
	public String getBookTitle() {
		return bookTitle;
	}
	/**
	 * @param bookTitle the bookTitle to set
	 */
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	/**
	 * @return the authors
	 */
	public String[] getAuthors() {
		return authors;
	}
	/**
	 * @param authors the authors to set
	 */
	public void setAuthors(String[] authors) {
		this.authors = authors;
	}
	/**
	 * @return the publishedDate
	 */
	public String getPublishedDate() {
		return publishedDate;
	}
	/**
	 * @param publishedDate the publishedDate to set
	 */
	public void setPublishedDate(String publishedDate) {
		this.publishedDate = publishedDate;
	}
	/**
	 * @return the noOfCopies
	 */
	public int getNoOfCopies() {
		return noOfCopies;
	}
	/**
	 * @param noOfCopies the noOfCopies to set
	 */
	public void setNoOfCopies(int noOfCopies) {
		this.noOfCopies = noOfCopies;
	}
	/**
	 * @return the bookId
	 */
	public String getBookId() {
		return bookId;
	}
}

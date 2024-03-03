package com.app.mysql.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.app.mysql.entity.Book;
import com.app.mysql.repository.BookRepository;
@Service
public class BookService {
	@Autowired
	private BookRepository bookRepository;
	public ResponseEntity<String> addBook(Book book) {
		try {
			bookRepository.save(book);
		} catch (Exception e) {
			throw new RuntimeException("Book not added");
		}
		return null;
	}
	public List<Book> getAllBook() {
		try {
			return bookRepository.findAll();
		} catch (Exception e) {
			throw new RuntimeException("Books not found");
		}
		
	}
}

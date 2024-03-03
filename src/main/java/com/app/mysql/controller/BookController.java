package com.app.mysql.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.mysql.entity.Book;
import com.app.mysql.service.BookService;
@RestController
@RequestMapping("/book")
public class BookController {
	@Autowired
	private BookService service;

	@PostMapping("/create")
	public ResponseEntity<String> createUser(@RequestBody Book book) {
		service.addBook(book);
		String msg = "Book added successfully";
		return ResponseEntity.ok(msg);
	}

	@GetMapping("/get")
	public ResponseEntity<List<Book>> findAllUser() {
		List<Book> user = service.getAllBook();
		return ResponseEntity.ok(user);
	}
}

package com.app.mysql.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.mysql.entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {

}

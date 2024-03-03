package com.app.mysql.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="book_db")
public class Book {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "book_id")
	private Integer bid;
	@Column(name = "book_name")
	private String name;
	@Column(name = "book_author")
	private String author;
}

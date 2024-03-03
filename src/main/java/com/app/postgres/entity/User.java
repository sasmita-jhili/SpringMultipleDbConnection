package com.app.postgres.entity;

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
@Table(name = "user_tb")
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "user_id")
	private Integer id;
	@Column(name = "user_name")
	private String name;
	@Column(name = "user_email")
	private String email;
}

package com.app.postgres.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.postgres.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}

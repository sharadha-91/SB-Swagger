package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.model.Book;

public interface BookRepository extends JpaRepository<Book,Integer> {

}

package com.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.BookRepository;
import com.app.model.Book;

@Service
public class BookService {
	
	@Autowired
	private BookRepository bookRepository;
	
	
	public String saveBook(Book book) {		
		bookRepository.save(book);	
        return "Book saved successfully!";
	}
	
	public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }
	
	public Book getBookById(int id) {
	
		return bookRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Book not found with ID: " + id));
    }
	
	public List<Book> deleteById(int id)
	{
		bookRepository.deleteById(id);
        return bookRepository.findAll();
	}
}

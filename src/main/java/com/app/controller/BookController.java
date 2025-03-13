package com.app.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Book;
import com.app.service.BookService;

import io.swagger.annotations.ApiOperation;

@RestController	
@RequestMapping("/book")
public class BookController {
	
	@Autowired
	private BookService bookService;
	
	@ApiOperation(notes =" This method is used to save the data ", value = "Hello to Book Controller")
	@PostMapping("/saveBook")
	public String saveBook(@RequestBody Book book) {
		return bookService.saveBook(book);
	}
	
	@GetMapping("/getAllBooks")   
    public List<Book> getListOfBooks() {
        System.out.println(" finding books...");
        return bookService.getAllBooks();
    }
	
	@GetMapping("/getBookById/{bookId}")    // localhost:8080/book/getBookById/1
    public Book getBookById(@PathVariable int bookId) {
        
        return bookService.getBookById(bookId);
    }
	
	@DeleteMapping("/deleteBookById/{bookId}")
	public List<Book> removeBookById(@PathVariable int bookId) {
		return bookService.deleteById(bookId);
		
	}
	

}

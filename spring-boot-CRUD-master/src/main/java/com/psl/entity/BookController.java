package com.psl.entity;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
public class BookController {
	
	@Autowired
	BookServices bookServices;
	
	@RequestMapping(method=RequestMethod.GET,path="/books")

	public List<Book> getAllBooks(){
		return bookServices.getAllBooks();
	}
	
	@RequestMapping(method=RequestMethod.GET,path="/books/{id}")
	public Book getBookById(@PathVariable("id") int id){
		return bookServices.getBookById(id);
	}
	
	@RequestMapping(method=RequestMethod.POST,path="/books")
	public void addBook(@RequestBody Book book){
		bookServices.addBook(book);
	}

	@RequestMapping(method=RequestMethod.DELETE,path="/books/{id}")
	public void deleteBook(@PathVariable("id") int id){
		bookServices.deleteBook(id);
	}
	
	@RequestMapping(method=RequestMethod.PUT,path="/books")
	public void updateBook(@RequestBody Book book){
		bookServices.updateBook(book);
	}
}

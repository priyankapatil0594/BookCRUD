package com.psl.entity;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServices {

	@Autowired
	BookRepository bookRepository;

	public List<Book> getAllBooks() {
		return (List<Book>) bookRepository.findAll();
	}

	public Book getBookById(int id) {
		return bookRepository.findOne(id);
	}

	public void addBook(Book book) {
		bookRepository.save(book);
	}

	public void deleteBook(int id) {
		bookRepository.delete(id);
	}
	
	public void updateBook(Book book) {
		bookRepository.save(book);
	}
}

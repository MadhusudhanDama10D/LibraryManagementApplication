package com.tendecoders.libraraymanagement.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tendecoders.libraraymanagement.model.Book;
import com.tendecoders.libraraymanagement.repository.BookRepository;

@RestController
@RequestMapping("/books")
public class HeyController {
		
		@Autowired
		BookRepository repo;
		@PostMapping("/saveBook")
		public String saveBooks(@RequestBody Book book) {
			repo.save(book);
			return "sucess";
			
		}
		@GetMapping("/getBooks")
		public List<Book> getBooks() {
			
			return (List<Book>)repo.findAll();
		}
		
		
		@GetMapping("get/{id}")
		private Optional<Book> getid(@PathVariable("id")long Id)
		{
			return repo.findById(Id);
		}
		
		@GetMapping("/deleteBook/{bookId}")
		public String deleteBook(@PathVariable int bookId ) {
		repo.delete(null);
		return "success";
		}
		
		

		
	}
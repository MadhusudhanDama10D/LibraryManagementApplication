package com.tendecoders.libraraymanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tendecoders.libraraymanagement.model.Book;
import com.tendecoders.libraraymanagement.repository.BookRepository;

@Component
public class BookService {
	
	
		@Autowired
		BookRepository bookRepository;

		public Book create(Book book) {

			return bookRepository.save(book);
		}

		public List<Book> getall() {

			return (List<Book>) bookRepository.findAll();

		}

		public Book get(long id) {

			return bookRepository.findById(id).get();

		}

		public void delete(int id) {

			Book lib = get(id);
			bookRepository.delete(lib);

		}

	}
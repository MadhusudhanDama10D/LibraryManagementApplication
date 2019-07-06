package com.tendecoders.libraraymanagement.repository;

import org.springframework.data.repository.CrudRepository;

import com.tendecoders.libraraymanagement.model.Book;
import com.tendecoders.libraraymanagement.service.BookService;;
public interface BookRepository extends CrudRepository<Book, Long> {

}

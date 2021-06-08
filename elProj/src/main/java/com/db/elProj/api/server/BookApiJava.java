package com.db.elProj.api.server;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.db.elProj.entity.Book;
import com.db.elProj.repository.BookElasticRepository;

@RestController
public class BookApiJava {
	
	@Autowired
	private BookElasticRepository bookRepository;
	
	@CrossOrigin
	@GetMapping(value= "/hello")
	public String hello() {
		return "Hello!";
	}
	
	@CrossOrigin
	@GetMapping("/search/wildcard/{pattern}")
	public List<Book> findByWildcard(@PathVariable String pattern){
		return bookRepository.findByWildcard(pattern);
	}
	
	@CrossOrigin
	@GetMapping(value = "/search/{description}")
	public List<Book> findByDesc(@PathVariable  String description){
			System.out.println("Description is "+description);
			return bookRepository.findByDescription(description);
	}
	
}

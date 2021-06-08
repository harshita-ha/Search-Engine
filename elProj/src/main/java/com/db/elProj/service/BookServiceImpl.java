package com.db.elProj.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.db.elProj.entity.Book;

@Service
public class BookServiceImpl implements BookService{
	
	@Override
	public  Book generateBook(List<String>bookList) {
		
		String text=bookList.get(4);
		
		for(int i=0;i<7;i++) {
			if(i==4) {
				continue;
			}
			text = text + " " + bookList.get(i);
		}
		
		Book book = new Book(bookList.get(1),text,bookList.get(5),bookList.get(6),bookList.get(2),bookList.get(0),bookList.get(3),bookList.get(4).length());
		
		return book;
	}
}

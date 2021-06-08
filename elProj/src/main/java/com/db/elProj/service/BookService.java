package com.db.elProj.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.db.elProj.entity.Book;

@Service
public interface BookService {
	Book generateBook(List<String>bookList);
}

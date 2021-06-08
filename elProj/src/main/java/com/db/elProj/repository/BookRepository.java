package com.db.elProj.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.db.elProj.entity.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {

}

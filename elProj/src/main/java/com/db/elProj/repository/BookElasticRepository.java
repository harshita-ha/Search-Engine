package com.db.elProj.repository;

import java.util.List;

import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import com.db.elProj.entity.Book;

@Repository
public interface BookElasticRepository  extends ElasticsearchRepository<Book,String> {
	public List<Book> findByDescription(String description);
	@Query("{\"wildcard\" : {\"description\" : \"?0\" }}")
	public List<Book> findByWildcard(String pattern);
}

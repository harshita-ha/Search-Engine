package com.db.elProj.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName="book-java")
public class Book {
	private String author;
	private String description;
	private String pages;
	private String genre;
	private String rating;
	private String title;
	private String price;
	@Id
	private String id;
	private int length;
	
	
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPages() {
		return pages;
	}
	public void setPages(String pages) {
		this.pages = pages;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Book(String author, String description, String pages, String genre, String rating, String title,
			String price,int length) {
		super();
		this.author = author;
		this.description = description;
		this.pages = pages;
		this.genre = genre;
		this.rating = rating;
		this.title = title;
		this.price = price;
		this.length = length;
	}
	@Override
	public String toString() {
		return "Book [author=" + author + ", description=" + description + ", pages=" + pages + ", genre=" + genre
				+ ", rating=" + rating + ", title=" + title + ", price=" + price + ", id=" + id + "]";
	}
}



//
//package com.db.elProj.entity;
//
//import org.springframework.data.annotation.Id;
//import org.springframework.data.elasticsearch.annotations.Document;
//
//@Document(indexName="book-java")
//public class Book {
//	private String author;
//	private String description;
//	private String pages;
//	private String genre;
//	private String rating;
//	private String title;
//	private String price;
//	@Id
//	private String id;
//	public String getAuthor() {
//		return author;
//	}
//	public void setAuthor(String author) {
//		this.author = author;
//	}
//	public String getDescription() {
//		return description;
//	}
//	public void setDescription(String description) {
//		this.description = description;
//	}
//	public String getPages() {
//		return pages;
//	}
//	public void setPages(String pages) {
//		this.pages = pages;
//	}
//	public String getGenre() {
//		return genre;
//	}
//	public void setGenre(String genre) {
//		this.genre = genre;
//	}
//	public String getRating() {
//		return rating;
//	}
//	public void setRating(String rating) {
//		this.rating = rating;
//	}
//	public String getTitle() {
//		return title;
//	}
//	public void setTitle(String title) {
//		this.title = title;
//	}
//	public String getPrice() {
//		return price;
//	}
//	public void setPrice(String price) {
//		this.price = price;
//	}
//	public String getId() {
//		return id;
//	}
//	public void setId(String id) {
//		this.id = id;
//	}
//	public Book(String author, String description, String pages, String genre, String rating, String title,
//			String price) {
//		super();
//		this.author = author;
//		this.description = description;
//		this.pages = pages;
//		this.genre = genre;
//		this.rating = rating;
//		this.title = title;
//		this.price = price;
//	}
//	@Override
//	public String toString() {
//		return "Book [author=" + author + ", description=" + description + ", pages=" + pages + ", genre=" + genre
//				+ ", rating=" + rating + ", title=" + title + ", price=" + price + ", id=" + id + "]";
//	}
//}



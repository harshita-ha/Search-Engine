package com.db.elProj.common;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

import com.db.elProj.entity.Book;
import com.db.elProj.repository.BookElasticRepository;
import com.db.elProj.service.BookService;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

@Component
public class BookElasticDatasource {
	
	@Autowired
	private BookElasticRepository bookRepository;
	
	@Autowired
	@Qualifier("webClientElasticsearch")
	private WebClient webClient;
	
	@Autowired
	@Qualifier("bookServiceImpl")
	private BookService bookService;
	
	@EventListener(ApplicationReadyEvent.class)
	public void populateData() {
		
		String response = webClient.delete().uri("/book-java").retrieve().bodyToMono(String.class).block();
		
		System.out.println("response is "+response);
		
		List<List<String>> records = new ArrayList<List<String>>();
		try (CSVReader csvReader = new CSVReader(new FileReader("/Users/harshitahazarika/Book.csv"));) {
		    String[] values = null;
		    while ((values = csvReader.readNext()) != null) {
		        records.add(Arrays.asList(values));
		    }
		    
		    List<Book>books = new ArrayList<>();
		    
		    for(int i=1;i<202;i++) {
		    	List<String>tmp=new ArrayList<>();
		    	for(int j=0;j<7;j++) {
		    		tmp.add(records.get(i).get(j));
		    	}
		    	books.add(bookService.generateBook(tmp));
		    } 
		    bookRepository.saveAll(books);
		    
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("IOException");
		} catch (CsvValidationException e) {
			// TODO Auto-generated catch block
			System.out.println("CsvValidationException");
//			e.printStackTrace();
		}catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
//			e.printStackTrace();
		}

	}
	
}

//}

//List<List<String>> records = new ArrayList<>();
//try (BufferedReader br = new BufferedReader(new FileReader("/Users/harshitahazarika/Book.csv"))) {
//    String line;
//    while ((line = br.readLine()) != null) {
//
//      	List<String> values = Arrays.asList(line.split(",", -1));
//      	if(values.size()!=12) {
//      		for(int i=0;i<values.size();i++) {
//      			System.out.println("i is " + i+"\n\n"+ values.get(i)+" ");
//      		}
//      		continue;
//      	}
//      	if(values.get(0).length() == 0) {
//      		continue;
//      	}
//        records.add(values);
//    }
//    
//    records.remove(0);
//    
//    System.out.println("Size is "+records.size());
//    
//    List<Book>books = new ArrayList<>();
//
//    for(int i=0;i<records.size();i++) {
//    	books.add(bookService.generateBook(records.get(i)));
//    }
//    
//    bookRepository.saveAll(books);
	

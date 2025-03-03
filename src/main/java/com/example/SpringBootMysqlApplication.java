package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.example.entity.Book;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example"})
public class SpringBootMysqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMysqlApplication.class, args);
		
		Book book = new Book(1l,"java", "james", 22.2);
		
		System.out.print(book.getAuthor());
	}

}

package com.example.solr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.solr.repository.config.EnableSolrRepositories;

@SpringBootApplication
@EnableSolrRepositories
public class SearchcharactersApplication {
	public static void main(String[] args) {
		SpringApplication.run(SearchcharactersApplication.class, args);
	}
}

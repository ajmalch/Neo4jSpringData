package com.example;

import org.neo4j.graphdb.GraphDatabaseService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.neo4j.config.EnableNeo4jRepositories;
import org.springframework.data.neo4j.config.Neo4jConfiguration;
import org.springframework.data.neo4j.rest.SpringRestGraphDatabase;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;

@Configuration
@EnableNeo4jRepositories("com.example.repository")
@Import(RepositoryRestMvcConfiguration.class)
@EnableAutoConfiguration
public class Application extends Neo4jConfiguration {

	public Application() {
	}
	
	@Bean
	public GraphDatabaseService graphDatabaseService() {
		SpringRestGraphDatabase service = new SpringRestGraphDatabase(
				"http://ec2-54-86-197-61.compute-1.amazonaws.com:7474/db/data/","neo4j", "training");
		this.setBasePackage("com.example");
		return service;
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
}

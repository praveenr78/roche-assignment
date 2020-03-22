package com.roche.assign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
public class RocheAssignmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(RocheAssignmentApplication.class, args);
	}

}

package com.kafkaproducer.InstalikeManagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InstalikeManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(InstalikeManagementApplication.class, args);
		System.out.println("Like Managment System is up.");
		System.out.println("Kafka-Producer is Up an Running:  ----->");
	}

}

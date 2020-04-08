package br.com.sample;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBatchMultithread1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBatchMultithread1Application.class, args);
	}

}
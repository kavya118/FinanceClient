package com.kavya;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class FinanceClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(FinanceClientApplication.class, args);
	}
	
	 
	@Bean
	   public RestTemplate restTemplate() {
	      return new RestTemplate();
	   }
}

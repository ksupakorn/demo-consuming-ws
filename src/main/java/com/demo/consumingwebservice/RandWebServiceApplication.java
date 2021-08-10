
package com.demo.consumingwebservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.demo.consumingwebservice.wsdl.Next1Response;
import com.example.consumingwebservice.wsdl.GetCountryResponse;

@SpringBootApplication
public class RandWebServiceApplication {
	
	private static final Logger log = LoggerFactory.getLogger(RandWebServiceApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(RandWebServiceApplication.class, args);
	}

	  
	
	@Bean
	CommandLineRunner lookup(RandClient randClient) {
		

		Next1Response res = (Next1Response) randClient.getNext();
		System.err.println(res.getRandRes());
		
		
		return null;
		
		
	}

}

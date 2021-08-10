
package com.demo.consumingwebservice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class RandConfiguration {

	@Bean
	public Jaxb2Marshaller marshaller() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		// this package must match the package in the <generatePackage> specified in
		// pom.xml
		marshaller.setContextPath("com.demo.consumingwebservice.wsdl");
		return marshaller;
	}

	@Bean
	public RandClient randClient(Jaxb2Marshaller marshaller) {
		RandClient client = new RandClient();
		client.setDefaultUri("http://localhost:8080/java-ws/RandService");
		client.setMarshaller(marshaller);
		client.setUnmarshaller(marshaller);
		return client;
	}

}

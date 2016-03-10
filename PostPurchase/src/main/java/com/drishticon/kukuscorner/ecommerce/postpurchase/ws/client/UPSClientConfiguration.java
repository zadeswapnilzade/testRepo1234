package com.drishticon.kukuscorner.ecommerce.postpurchase.ws.client;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class UPSClientConfiguration {

	@Bean
	public Jaxb2Marshaller marshaller() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setContextPath("com.drishticon.kukuscorner.ecommerce.carrier.model.jaxb.ups");
		return marshaller;
	}

	@Bean
	public UPSClient upsClient(Jaxb2Marshaller marshaller) {
		UPSClient client = new UPSClient();
		client.setDefaultUri("https://wwwcie.ups.com/webservices/Track");
		client.setMarshaller(marshaller);
		client.setUnmarshaller(marshaller);
		return client;
	}

}


	

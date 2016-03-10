package com.drishticon.kukuscorner.ecommerce.postpurchase;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.ws.config.annotation.EnableWs;

import com.drishticon.kukuscorner.ecommerce.postpurchase.service.TrackingService;
import com.drishticon.kukuscorner.ecommerce.postpurchase.util.ApplicationContextUtils;

@SpringBootApplication
@EnableAutoConfiguration
@Configuration
@ComponentScan("com.drishticon.kukuscorner.ecommerce.postpurchase")
@EnableWs

public class TrackingApplication {

	public static void main(String[] args) {
	//	SpringApplication.run(TrackingApplication.class, args);
		
    //   TrackingService trackingService =  (TrackingService) ApplicationContextUtils.getApplicationContext().getBean("UPSTrackingImpl");

     //  trackingService.getTracking("1Zuiguuihguhgurg");
      
       
       ApplicationContext ctx = SpringApplication.run(TrackingApplication.class, args);

       System.out.println("Let's inspect the beans provided by Spring Boot:");

       String[] beanNames = ctx.getBeanDefinitionNames();
       Arrays.sort(beanNames);
       for (String beanName : beanNames) {
          //  System.out.println(beanName);
        
	}
       
       
       TrackingService trackingService =  (TrackingService) ctx.getBean("UPSTrackingImpl");

      System.out.println(trackingService.getTracking("jiijdiojoidjb"));
      
       
	}
}

package com.programming.techie.apigateway;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.programming.techie.apigateway.config.SecurityConfig;



@SpringBootApplication
@EnableEurekaClient
public class ApiGatewayApplication {
	private static ApplicationContext applicationContext;
    public static void main(String[] args) {
    	
        SpringApplication.run(ApiGatewayApplication.class, args);
    	//applicationContext = SpringApplication.run(ApiGatewayApplication.class, args);
       // displayAllBeans();
    }
    
	/*
	 * public static void displayAllBeans() { String[] beans =
	 * applicationContext.getBeanDefinitionNames(); Arrays.sort(beans); for (String
	 * bean : beans) { System.out.println(bean); } }
	 */
   @Bean
    public void loadData() {
        System.out.println("test");
        
      
        };
    
    
}

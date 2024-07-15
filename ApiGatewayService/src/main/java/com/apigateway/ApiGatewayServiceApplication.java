package com.apigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * The main class for the API Gateway Service application.
 * This class contains the entry point for the Spring Boot application.
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ApiGatewayServiceApplication {

    /**
     * The main method which serves as the entry point for the Spring Boot application.
     *
     * @param args Command line arguments passed during the application startup.
     */
    public static void main(String[] args) {
        // Launch the application
        SpringApplication.run(ApiGatewayServiceApplication.class, args);
    }
}

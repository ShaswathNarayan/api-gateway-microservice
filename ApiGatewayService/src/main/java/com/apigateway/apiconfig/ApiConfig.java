package com.apigateway.apiconfig;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Configuration class for API Gateway routing.
 * This class defines the routes for the gateway to direct traffic to appropriate services.
 */
@Configuration
public class ApiConfig {

    /**
     * Defines custom route locator for the API Gateway.
     *
     * @param builder RouteLocatorBuilder to build the routes.
     * @return RouteLocator containing the configured routes.
     */
    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
            // Route for Pharmaceutical Management System
            .route("PharmaceuticalManagementSystem", r -> r
                .path("/api-pharmaceutical/**")
                .uri("http://localhost:8061"))

            // Route for Sales Service
            .route("SalesService", r -> r
                .path("/sales/**")
                .uri("http://localhost:8071"))
            .build();
    }
}

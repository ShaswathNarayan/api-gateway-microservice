package com.apigateway.apiconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.reactive.CorsWebFilter;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;

/**
 * Configuration class for setting up Cross-Origin Resource Sharing (CORS).
 * This class allows specific origins, HTTP methods, and headers to be used when accessing the API.
 */
@Configuration
public class CorsConfig {

    /**
     * Configures CORS settings for the application.
     *
     * @return a CorsWebFilter with the configured CORS settings.
     */
    @Bean
    public CorsWebFilter corsFilter() {
        // Create a new CORS configuration
        CorsConfiguration config = new CorsConfiguration();
        
        // Allow specific origin
        config.addAllowedOrigin("http://127.0.0.1:5500");
        
        // Allow all HTTP methods
        config.addAllowedMethod("*");
        
        // Allow specific headers
        config.addAllowedHeader("Content-Type");
        //Authorization header
        config.addAllowedHeader("Authorization");
        config.addAllowedHeader("X-Requested-With");
        config.addAllowedHeader("Accept");
        
        // Allow credentials
        config.setAllowCredentials(true);

        // Register the CORS configuration for all paths
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", config);

        // Return a new CORS web filter with the configured source
        return new CorsWebFilter(source);
    }
}

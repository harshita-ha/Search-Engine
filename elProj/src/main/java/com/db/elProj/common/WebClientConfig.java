package com.db.elProj.common;

import org.apache.http.HttpHeaders;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConfig {
	@Bean(name="webClientElasticsearch")
	public WebClient webClientElasticsearch() {
		return WebClient.builder().baseUrl("http://localhost:9200").defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE).build();
	}
//	@Bean
//	public CorsFilter corsFilter() {
//
//	    UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
//	    CorsConfiguration config = new CorsConfiguration();
//	    //config.setAllowCredentials(true); // you USUALLY want this
//	    config.addAllowedOrigin("*");
//	    config.addAllowedHeader("*");
//	    config.addAllowedMethod("OPTIONS");
//	    config.addAllowedMethod("HEAD");
//	    config.addAllowedMethod("GET");
//	    config.addAllowedMethod("PUT");
//	    config.addAllowedMethod("POST");
//	    config.addAllowedMethod("DELETE");
//	    config.addAllowedMethod("PATCH");
//	    source.registerCorsConfiguration("/**", config);
//	    return new CorsFilter((CorsConfigurationSource)source);
//	}
}

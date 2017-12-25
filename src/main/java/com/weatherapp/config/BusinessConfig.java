package com.weatherapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class BusinessConfig {

	@Bean
	RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
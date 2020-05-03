package br.com.cripto.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

@Configuration
public class BeanBuild {

	public static final String TOKEN = "c16f69cede9fd74764d37f6c74a8e34a7d0c59f6";
	
	@Bean
	public RestTemplate getRestTemplate() {
		
		return new RestTemplate();
	}
	
	@Bean
	public ObjectMapper getObjectMapper() {
		
		return new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);
	}
}
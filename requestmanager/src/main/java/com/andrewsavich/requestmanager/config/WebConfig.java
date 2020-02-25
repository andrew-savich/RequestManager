package com.andrewsavich.requestmanager.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.andrewsavich.requestmanager")
public class WebConfig {

	@Bean
	ViewResolver viewResolver() {
		InternalResourceViewResolver vewiResolver = new InternalResourceViewResolver();
		vewiResolver.setPrefix("/WEB-INF/view/");
		vewiResolver.setSuffix(".jsp");
		return vewiResolver;
	}
	
}

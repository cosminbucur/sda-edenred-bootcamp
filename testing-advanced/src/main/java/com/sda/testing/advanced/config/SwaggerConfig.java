package com.sda.testing.advanced.config;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerConfig {

	// http://localhost:8083/swagger-ui/index.html

	@Bean
	public Docket api() {
		return new Docket(DocumentationType.OAS_30)
				.apiInfo(apiInfo())
				.select()
				.apis(RequestHandlerSelectors.any())
				.paths(PathSelectors.any())
				.build();
	}

	private ApiInfo apiInfo() {
		return new ApiInfo("CRUD API docs",
				"API for a crud application",
				"1.0",
				"Terms of service",
				new Contact("test", "www.sda.com", "test@sda.com"),
				"License of API",
				"API license URL",
				Collections.emptyList());
	}
}
package com.app.config;

import static springfox.documentation.builders.PathSelectors.regex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.RequestHandler;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class BookConfig {
	
	
	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("Book Service")
				.description("Sample Documentation Generateed Using SWAGGER2 for our Book Rest API")
				.version("1.0").build();
	}
	
	@Bean
	public Docket postsApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(apiInfo())
				.select()
				.paths(PathSelectors.any())
				//.apis(RequestHandlerSelectors.basePackage("com.app"))
				.build();
	}

}

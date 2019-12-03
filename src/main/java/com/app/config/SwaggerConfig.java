package com.app.config;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Bean
	public Docket productApi() {
		return new Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors.basePackage("com.app"))
				.build().apiInfo(metaData());
	}

	@Bean
	public ApiInfo metaData() {
		Contact contact = new Contact("Ajay", "url", "ajayshukla.bhu@gmail.com");
		Collection<VendorExtension> vendorExtensions = new ArrayList<VendorExtension>();
		ApiInfo apiInfo = new ApiInfo("Swagger Demo", "Spring boot swagger with Docker", "1.0", "termsOfServiceUrl",
				contact, "license", "licenseUrl", vendorExtensions);
		return apiInfo;
	}
}

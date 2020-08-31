package com.self.practice.target;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.self.practice.target.dao.UserRepository;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
@EnableSwagger2
public class SpringSecurityJpaApplication {

	private static final Logger logger = LoggerFactory.getLogger(SpringSecurityJpaApplication.class);
	public static void main(String[] args) {
		logger.info("Execution started from {}", SpringSecurityJpaApplication.class.getSimpleName());
		SpringApplication.run(SpringSecurityJpaApplication.class, args);
	}

	@Bean
	public Docket swaggerConfiguration() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.paths(PathSelectors.ant("/*"))
				.apis(RequestHandlerSelectors.basePackage("com.self.practice.target"))
				.build()
				.apiInfo(apiDetails());
	}
	
	private ApiInfo apiDetails() {
		return new ApiInfo("Spring Security JPA Mysql", 
				"Spring Security JPA Mysql for personal enhancement", 
				"1.0", 
				"Free for Personal Use", 
				new springfox.documentation.service.Contact("Anup Mallick", "https://github.com/anupmallick/SpringBoot-Microservice", "ianupmallick@gmail.com"), 
				"Api License", 
				"https://github.com/anupmallick/SpringBoot-Microservice", 
				java.util.Collections.emptyList());
	}
}

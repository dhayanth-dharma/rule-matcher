package com.aitenders.parser;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
//@EnableAutoConfiguration
//@ComponentScan

//@EnableJpaRepositories(basePackages = "com.itcps2.repository")
//@ComponentScan({"com.itcps2.service"})
//@EntityScan({"com.itcps2.filling.model", "com.aitenders.parser.model"})
//@EnableJpaRepositories({"com.itcps2.repository","com.aitenders.parser.repositories"})
//
//@EntityScan("com.itcps2.filling.model")
//@EnableJpaRepositories("com.itcps2.repository")
//@EnableJpaRepositories("com.aitenders.parser.repositories")
//@EntityScan("com.aitenders.parser.model")
@EntityScan(basePackages = { "com.aitenders.parser.model" })
@EnableJpaRepositories(basePackages = {"com.aitenders.parser.repositories"})
@EnableSwagger2

//SpringBootServletInitializer
public class Parser {
	
	public static void main(String[] args) throws KeyManagementException, NoSuchAlgorithmException {
		SpringApplication.run(Parser.class, args);
		
		
	}

}

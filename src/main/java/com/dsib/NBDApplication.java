package com.dsib;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;


@SpringBootApplication
@MapperScan("com.dsib.modules.**.dao")
public class NBDApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(NBDApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(NBDApplication.class);
	}
}

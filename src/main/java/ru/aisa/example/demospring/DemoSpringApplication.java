package ru.aisa.example.demospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import ru.aisa.example.demospring.controller.IndexController;

@SpringBootApplication
public class DemoSpringApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(DemoSpringApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringApplication.class, args);
	}
}

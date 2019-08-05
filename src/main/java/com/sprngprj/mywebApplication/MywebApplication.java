package com.sprngprj.mywebApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages= {"com.springprj.mywebApplication.rest"})
public class MywebApplication {

	public static void main(String[] args) {
		SpringApplication.run(MywebApplication.class, args);
	}

}

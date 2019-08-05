package com.sprngprj.mywebApplication.rest;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {

@GetMapping("/")
public String helloFucntion()
{
	return "Hello World!";
}

@GetMapping("/workout")
public String workoutFunction()
{
	return ""+LocalDateTime.now();
}
}

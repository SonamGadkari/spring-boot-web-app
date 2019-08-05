package com.sprngprj.mywebApplication.rest;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {
	
	@Value("${coach.name}")
	public String coachName;
	@Value("${team.name}")
	public String teamName;
	
@GetMapping("/teaminfo")
public String teamFunction() 
{
	return coachName+" "+teamName;
}

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

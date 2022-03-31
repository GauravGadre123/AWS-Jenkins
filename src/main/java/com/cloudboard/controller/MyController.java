package com.cloudboard.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@RequestMapping("/get")
	public String get() 
	{
		return "code by ganesh.Auto deployment on gcp using jenkins";
	} 
	
}  

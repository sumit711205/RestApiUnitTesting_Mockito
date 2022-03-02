package com.sumit.restapi.mockito.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemController {

	@GetMapping("/hello_world")
	public String hello_world()
	{
		return "Hello World";
	}
}

package com.course.springboot.demo.myapp.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@GetMapping("/")
	public String test() {
		return "ciao";
	}
	
	@GetMapping("/0")
	public String test2() {
		return "ciao2";
	}

}

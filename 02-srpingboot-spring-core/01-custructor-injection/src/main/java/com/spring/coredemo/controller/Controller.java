package com.spring.coredemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.coredemo.interfacetest.Coach;

@RestController
public class Controller {
	
	private Coach myCoach;
	
	@Autowired
	public Controller(Coach myCoach) {
		this.myCoach = myCoach;
	}
	
	@GetMapping("/getDalyWorkout")
	public String getDalyWorkout() {
		return myCoach.getDalyWorkout();
	}
	
	@GetMapping("/")
	public String test() {
		return "test";
	}

}

package com.spring.coredemo.common;

import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach{

	@Override
	public String getDailyWorkout() {
		return "trackCoach test";
	}
	
	public TrackCoach() {
		System.out.println("in custoctor :" + getClass().getSimpleName());
	}

}

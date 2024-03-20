package com.spring.coredemo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component // as a spring bean avaible for dependency injection
public class Zumba implements Coach{
	
	@Override
	public String getDailyWorkout() {
		return "zumba every day";
	}

}

package com.annotations.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

	
	private FortuneService fortuneService;
	
	@Override
	public String getDailyWorkout() {
		return "Cricket Coach class method daily workout";
	}

	@Override
	public String getDailyFortune() {
		System.out.println("Cricket Coach fortune service get fortune method");
		return fortuneService.getFortune();
	}

}

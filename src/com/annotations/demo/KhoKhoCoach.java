package com.annotations.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class KhoKhoCoach implements Coach{
	
	private FortuneService fortuneService;
	
	@Autowired
	public KhoKhoCoach(@Qualifier("happyFortuneService")FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "KhoKho game is fun.";
	}

	@Override        
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
	
	@Autowired
	public void methodInjectionByAutowiring(FortuneService fortuneService) {
		System.out.println("this means autowiring can be done on any method nut just constructors and setters");
		this.fortuneService = fortuneService;
	}
}

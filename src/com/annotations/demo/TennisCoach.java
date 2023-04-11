package com.annotations.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("thatSillyCoach")
public class TennisCoach implements Coach {

	private FortuneService fortuneService;
	
	public TennisCoach(){
		System.out.println("inside tennis coach constructor");
	}
	public String getDailyWorkout() {
		return "practice your tennis game";
	}
	
    @Autowired 
	public void setFortuneService(FortuneService fortuneService) {
    	System.out.println("inside tennis coach setter");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}

}

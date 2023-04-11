package com.annotations.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Coach theCoach = context.getBean("thatSillyCoach", Coach.class);
		
		//Coach anotherCoach = context.getBean("khoKhoCoach", Coach.class);
		
		Coach anotherCricketCoach = context.getBean("cricketCoach", Coach.class);
		
//		System.out.println(anotherCoach.getDailyWorkout());
//		System.out.println(anotherCoach.getDailyFortune());
//		System.out.println("---------------------------------------");
//		System.out.println(theCoach.getDailyWorkout());
		System.out.println("---------------------------------------");
		System.out.println(anotherCricketCoach.getDailyWorkout());
		System.out.println(anotherCricketCoach.getDailyFortune());
		context.close();

	}

}

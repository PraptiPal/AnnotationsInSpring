package com.annotations.demo;

import org.springframework.stereotype.Component;

@Component
public class RandomServiceQualifierDemonstration implements FortuneService {

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return "this is qualifier demo service";
	}

}

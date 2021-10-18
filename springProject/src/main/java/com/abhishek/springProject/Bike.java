package com.abhishek.springProject;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle{ 
	
	public void drive() {
		System.out.println("bhaag raha hai....");
	}
}

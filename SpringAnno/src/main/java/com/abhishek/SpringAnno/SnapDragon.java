package com.abhishek.SpringAnno;

import org.springframework.stereotype.Component;

@Component
public class SnapDragon implements MobileProcessor {

	@Override
	public void Process() {
		System.out.println("World's best cpu");
	}
}

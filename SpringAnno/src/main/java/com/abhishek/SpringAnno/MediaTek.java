package com.abhishek.SpringAnno;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MediaTek implements MobileProcessor {

	@Override
	public void Process() {
		System.out.println("2nd best cpu");
	}

}

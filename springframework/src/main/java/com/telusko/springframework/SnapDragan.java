package com.telusko.springframework;

import org.springframework.stereotype.Component;

@Component
public class SnapDragan implements MobileProcessor {

	public void processor() {
		System.out.println("World Best CPU");
	}

}

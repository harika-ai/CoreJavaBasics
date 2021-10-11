package com.telusko.springframework;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vechile {

	public void driver() {
		System.out.println("driving a bike");
	}
}

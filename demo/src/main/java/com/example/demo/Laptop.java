package com.example.demo;

import org.springframework.stereotype.Component;

@Component("lap1")
public class Laptop {

	private int lid;
	private String brnad;

	
	public int getLid() {
		return lid;
	}

	public void setLid(int lid) {
		this.lid = lid;
	}

	public String getBrnad() {
		return brnad;
	}

	public void setBrnad(String brnad) {
		this.brnad = brnad;
	}

	@Override
	public String toString() {
		return "Laptop [lid=" + lid + ", brnad=" + brnad + "]";
	}

	public void compile() {
		System.out.println("compile");
	}

}

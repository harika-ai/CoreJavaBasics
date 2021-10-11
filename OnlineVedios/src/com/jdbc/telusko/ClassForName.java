package com.jdbc.telusko;

public class ClassForName {

	public static void main(String[] args) throws Exception {

		Class.forName("Ghj");
	}

}

class Ghj{
	static {
		System.out.println("static bock");
	}

	// instacnce
	{
		System.out.println("Instance will be created");
	}
}
package com.telusko.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * char myCharcater = "piper".charAt(3); System.out.println(myCharcater); String
		 * f="strawberries"; System.out.println(f.substring(2,5));
		 */
		String mess = "Hello world!";
		// String newmes = mess.substring(6, 12) + mess.substring(12, 6);
		// System.out.println(newmes);
		int[] sampleNumbers = { 8, 5, 3, 1 };
		/*
		 * ExceptionDemo d = new ExceptionDemo(); System.out.println(sampleNumbers[2]);
		 * try { System.out.println("A"); ExceptionDemo.badmethod();
		 * System.out.println("B"); } catch (Exception e) { System.out.println("c"); }
		 * finally { System.out.println("D");
		 * 
		 * }
		 */
		String[] array = { "abc", "2", "10", "0" };
		List<String> list = Arrays.asList(array);
		Collections.sort(list);
		System.out.println(Arrays.toString(array));
		List<Duck> ducks = new ArrayList<>();

		Duck waddles=new Duck(mess);
		ducks.add(new Duck("messgae"));
	
	}
}

/*
 * class ExceptionDemo { public static void badmethod() { throw new Error(); } }
 */
class Duck{
	private String name;
	Duck(String name){}
}
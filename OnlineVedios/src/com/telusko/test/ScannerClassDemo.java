package com.telusko.test;

import java.util.Scanner;

public class ScannerClassDemo {

	public static void main(String[] args) {

		int n = 0;
		String m = null;
		double dd = 0.0;
		float f = 0.0f;
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		System.out.println("Enter a Double");
		dd = sc.nextDouble();
		System.out.println(dd);
		System.out.println("Enter a Float");
		f = sc.nextFloat();
		Scanner ss = new Scanner(System.in);
		System.out.println("Enter a string");
		m = ss.nextLine();
		System.out.println(n);
		System.out.println(m);
		System.out.println(f);
	}
}

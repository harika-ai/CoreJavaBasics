package com.telusko.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class test {
	static int count = 0;

	public static void main(String[] args) {
		/*
		 * if(count<3) { count++; main(null); }else { return; }
		 * System.out.println("jhj");
		 */
		LinkedList<Integer> list = new LinkedList<>();
		list.add(5);
		list.add(1);
		list.add(10);
		System.out.println(list);
		/*
		 * Math.isDivisble(int 0,5); if() { true; System.out.println("hgh"); }
		 */
		String[] array = new String[] { "A", "B", "C" };
		List<String> list1 = Arrays.asList(array);
		List<String> list2 = new ArrayList<>(Arrays.asList(array));
		List<String> list3 = new ArrayList<>(Arrays.asList("A", new String("B"), "c"));
		// List<String> words=new ArrayList<>(Arrays.asList("Hello","world"));
		System.out.println(list1.equals(list2));
		
		System.out.println(list1.equals(list3));
		int a = 0;
		int b = 5;
		// int c=b/a;
		System.out.println("jhuy");
		double a1 = 295.04;
		int b1 = 300;
		byte c1 = (byte) a1;
		byte d1 = (byte) b1;
		System.out.println(c1 + "" + d1);
		// int arr[] arr = new int[5];
		// int arr1[] = int [5] new;
		int arr2[] = new int[5];
		int[] arr3 = new int[5];
		String s1 = "Hello World";
		String s2 = s1.substring(0 , 4);
		System.out.println(s2);
	}
}

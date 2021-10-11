package com.telusko.test;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {

		Set<Integer> values = new HashSet<>();
		// hash set won't give orderd values
		//its takes the values based in Hashing values
		// Set is used to allow only unique values
		Set<Integer> value = new TreeSet<>();
		values.add(5);
		values.add(7);
		values.add(10);
		values.add(97);
		for (int i : values) {
			System.out.println(i);
		}
	}

}

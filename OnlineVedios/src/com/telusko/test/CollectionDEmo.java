package com.telusko.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

//for sorting elements we need to use sorting ,but here no need collection API itself calls internal classes
public class CollectionDEmo {

	public static void main(String[] args) {

		List<Integer> values = new ArrayList<>();

		values.add(98);
		values.add(66);
		values.add(49);
		values.add(55);

		Collections.sort(values);// ascending order
		Collections.reverse(values);// mutable we can change again order for as it is
		Collections.shuffle(values);// foe Random shuffle

		for (Integer i : values) {
			System.out.println(i);
		}
		// if we want sort from last digit of number

		// Integer class implements comparable interface--comapre to method

		Comparator<Integer> c = new Comparator<Integer>() {// Anonymous class it used because comparator interface not
															// implementing any class

			@Override
			public int compare(Integer i, Integer j) {
				if (i % 10 > j % 10)
					return 1;// need to swap
				else
					return -1;// no need to swap
				// return i%10>j%10?1:-1;
			}
		};
		// for functional interfcae with Lamda expression as below
		Comparator<Integer> c1 = (i, j) -> i%10>j%10?1:-1;
		Collections.sort(values,c1);
		//Collections.sort(values,(i, j) -> i%10>j%10?1:-1);
		Collections.sort(values, c);
		for (Integer i : values) {
			System.out.println(i);
		}
	HashMap<String, Integer> pantry=new HashMap<>();
	pantry.put("Apples", 3);
	pantry.put("ples", 2);	
	int currentApples=pantry.get("Apples");
	pantry.put("Apples", currentApples+4);	
	System.out.println(pantry.get("Apples"));
		
		
		
		
	}
}

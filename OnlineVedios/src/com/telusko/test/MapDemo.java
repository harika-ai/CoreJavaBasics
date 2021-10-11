package com.telusko.test;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {

		// key value pair
		Map<String, String> map = new Hashtable();
		map.put("myName", "Navin");
		map.put("ceo", "Marsia");
		map.put("actor", "john");
		map.put("actor", "Akshy");
		map.put("employee", "john");
		// we cannot repeat the key values..we can repeat the values
		System.out.println(map);
		//set is used  insert unique values
		//keySet() is used to store the set of key values
		Set<String> keys = map.keySet();
		for (String key : keys) {
			System.out.println(key + " " + map.get(key));
		}
		
	}
}

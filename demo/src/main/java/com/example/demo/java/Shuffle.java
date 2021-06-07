package com.example.demo.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Shuffle {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");

		System.out.println("List is: " + list);

		// Here we use Random() to shuffle given list.
		Collections.shuffle(list);
		System.out.println("Shuffled List : " + list);

		Map<String, Integer> map = new HashMap<>();
		map.put("One", 1);
		map.put("Two", 2);
		map.put("Three", 3);
		map.put("Four", 4);
		List<Integer> keys = new ArrayList(map.keySet());
		Collections.shuffle(keys);
		System.out.println("\nShuffled Map : ");
		for (Object s : keys) {
			System.out.println(map.get(s)); 
		}
	}

}

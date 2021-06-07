package com.example.demo.java;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class HashMapSort {
		
	private static HashMap<String, Integer> Sort(HashMap<String, Integer> map) {
		List<Map.Entry<String,Integer>> list= new LinkedList<Map.Entry<String,Integer>>(map.entrySet()) ;
		Collections.sort(list, new Comparator<Map.Entry<String, Integer>>()
				{

					public int compare(Map.Entry<String, Integer> val1, Map.Entry<String, Integer> val2) {
						return val1.getValue().compareTo(val2.getValue());
					}
			
				});
		
		HashMap<String, Integer> map2 = new LinkedHashMap<>();
		for(Map.Entry<String, Integer> m:list)
		{
			map2.put(m.getKey(), m.getValue());
		}
		return map2;
	}
	
	public static void main(String[] args) {

		HashMap<String, Integer> map = new HashMap<String,Integer>();
		map.put("Four", 4);
		map.put("One", 1);
		map.put("Three", 3);
		map.put("Two", 2);
		
		System.out.println("HashMap before sorting: ");
		for(Map.Entry<String, Integer> m: map.entrySet())
		{
			System.out.println(m.getKey() + "  " + m.getValue());
		}
		
		HashMap<String, Integer> sortedMap = Sort(map);
		System.out.println("HashMap after sorting: ");
		for(Map.Entry<String, Integer> m: sortedMap.entrySet())
		{
			System.out.println(m.getKey() + "  " + m.getValue());
		}
	}


}


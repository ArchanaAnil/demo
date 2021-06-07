package com.example.demo.java;

import java.util.HashSet;

public class CompareTwoSets {

	public static void main(String[] args) {
		HashSet<Integer> first=new HashSet<>();
		first.add(1);
		first.add(2);
		first.add(3);
		first.add(4);
		first.add(5);
		System.out.println("First set: " + first);
		HashSet<Integer> second=new HashSet<>();
		second.add(3);
		second.add(5);
		System.out.println("Second set: "+ second);
		
		first.retainAll(second);
		System.out.println("Retained set: " + first);
		
	}

}

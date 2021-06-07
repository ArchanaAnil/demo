package com.example.demo.java;

import java.util.ArrayList;
import java.util.Scanner;

public class ReverseArrayList {
	
	public static ArrayList<Integer> reverse(ArrayList<Integer> arrList) {
		int temp,size = arrList.size();
		for(int i=0;i<(size/2);i++)
		{
			temp=arrList.get(i);
			arrList.set(i, arrList.get(size-(i+1)));
			arrList.set(size-(i+1), temp);
			
		}
		return arrList;
	}

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		ArrayList<Integer> arrList = new ArrayList<>();
		ArrayList<Integer> revArrList = new ArrayList<>();
		System.out.println("Enter the number of elements: ");
		int r=sc.nextInt();
		System.out.println("Enter the elements: ");
		for(int i=0;i<r;i++)
		{
			arrList.add(sc.nextInt());
		}
		System.out.println("ArrayList before reversing: ");

		for (int i = 0; i < arrList.size(); i++) {
            System.out.print(arrList.get(i) + " ");
        }
		revArrList=reverse(arrList);
		System.out.println("\nArrayList after reversing: ");
		for (int i = 0; i < arrList.size(); i++) {
            System.out.print(arrList.get(i) + " ");
        }
		
	}

	

}

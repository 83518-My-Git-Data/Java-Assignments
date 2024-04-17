package com.sunbeam.collections.list;

import java.util.ArrayList;
import java.util.List;

public class Program02 {

	public static void main(String[] args) {
		
		
		List<Integer> l1 =  new ArrayList<>();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		l1.add(10);
		l1.add(50);
		
		for(Integer element: l1)
		{
			System.out.println("Element  -  " + element);
		}
		
		System.out.println("Index of 10 - " + l1.indexOf(10)); //takes the first  occurence
		System.out.println("Index of 10 - " + l1.lastIndexOf(10)); //takes the last occurence
	

	}

}

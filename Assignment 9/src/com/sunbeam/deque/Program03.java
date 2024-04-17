package com.sunbeam.deque;

import java.util.Deque;
import java.util.LinkedList;

public class Program03 {

	public static void main(String[] args) {
		
		Deque<Integer> d1 =  new LinkedList<>();
		
		d1.addFirst(10);
		d1.addFirst(20);
		d1.addFirst(30);
		d1.addFirst(40);
		
		System.out.println("Elements - " + d1);
		
		d1.pollLast();
		d1.pollLast();
		
		System.out.println("After popping  elements from the deque Stack");
		
		System.out.println("Elements - " + d1);
		
		


		

	}

}

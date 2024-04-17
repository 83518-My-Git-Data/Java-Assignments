package com.sunbeam.collections.list.ownobj;

import java.util.Stack;

public class Program03 {
	public static void main(String[] args) {
		
		Stack<Integer> s =  new Stack<>();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		
		System.out.println("Size of the Stack: " + s.size());
		

		System.out.println("using for each loop");
		for (Integer element : s)
		{
			System.out.println(element);			
		}
		
		for (int i = 0; i < 4; i++) {
			int element = s.pop();
			System.out.println("POPPED element - " + element);
		}
		
	}

}

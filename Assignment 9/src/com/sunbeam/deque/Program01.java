package com.sunbeam.deque;

import java.util.ArrayDeque;
import java.util.Queue;

public class Program01 {

	public static void main(String[] args) {
		
		Queue<Integer> q1 = new ArrayDeque<>();
		
		q1.offer(10);
		q1.offer(20);
		q1.offer(30);
		
		System.out.println("using peek and poll: ");
		System.out.println("peek - "+ q1.peek());
		System.out.println("Poll - "+ q1.poll());
		System.out.println("peek - "+ q1.peek());
		
		System.out.println("Using element and remove: ");
		System.out.println("Element - "+q1.element());
		System.out.println("Remove - "+q1.remove());
		System.out.println("Element - "+q1.element());
		
	}

}

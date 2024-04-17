package com.sunbeam.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class Program02 {

	public static void main(String[] args) {

		Deque<Integer> dq = new ArrayDeque<>();
		dq.add(10);
		dq.addFirst(20);
		dq.addFirst(30);
		dq.addFirst(40);
		dq.addLast(50);

		if (dq.contains(new Integer(30))) {
			System.out.println("Element is Present in the deque");
		} else {
			System.out.println("Element is not present in the deque");
		}

		dq.offer(60);

		System.out.println("Elements - " + dq);

		System.out.println("Element Removed - " + dq.remove());

		System.out.println("Elements - " + dq);

		dq.offerFirst(70);

		System.out.println("Elements - " + dq);

		dq.offerLast(80);

		System.out.println("Elements - " + dq);

		System.out.println("Elements - " + dq.pop());
		System.out.println("Elements - " + dq);

		System.out.println("Elements - " + dq.element());

		System.out.println("Popped First Element- " + dq.pollFirst());
		System.out.println("Elements - " + dq);

		System.out.println("Popped Last Element - " + dq.pollLast());
		System.out.println("Elements - " + dq);
		
		System.out.println("Size of the Deque - " + dq.size());
		
		System.out.println("Peek FIrst Element - " + dq.peekFirst());
		System.out.println("Peek Last Element - " + dq.peekLast());
		
		System.out.println("Get FIrst Element - " + dq.getFirst());
		System.out.println("Get Last Element - " + dq.getLast());
		
		


	}

}

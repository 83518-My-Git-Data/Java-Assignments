package com.sunbeam.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeStack {

	public static void main(String[] args) {

		Deque<Integer> d1 = new ArrayDeque<>();

		d1.addFirst(10);
		d1.addFirst(20);
		d1.addFirst(30);
		d1.addFirst(40);

		System.out.println("Elements - " + d1);

		d1.pollLast();
		d1.pollLast();

		System.out.println("After popping 2 elements from the deque Stack");

		System.out.println("Elements - " + d1);

	}
}

package com.sunbeam.collections.list.ownobj;

import java.util.ArrayList;

public class Program02 {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<>();

		for (int i = 1; i <= 10; i++)
			a.add(10 * i);

		System.out.println("using FOR EACH loop");
		for (Integer element : a)
			System.out.println(element);

		System.out.println("Size of arraylist - " + a.size());

	}

}

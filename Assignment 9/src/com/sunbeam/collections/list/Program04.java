package com.sunbeam.collections.list;

import java.util.ArrayList;
import java.util.Iterator;

public class Program04 {

	public static void main(String[] args) {
		// List<Integer> l1 = new ArrayList<>();
		ArrayList<Integer> l1 = new ArrayList<>();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		l1.add(50);

		// fail-fast iterators
		Iterator<Integer> itr = l1.iterator();
		while (itr.hasNext()) {
			int element = itr.next();
			System.out.println("Element - " + element);
			if (element == 30)
				// l1.add(60);
				l1.set(3, 60);
		}

		System.out.println("After Modification - ");
		for (Integer element : l1)
			System.out.println("Element - " + element);

	}

}

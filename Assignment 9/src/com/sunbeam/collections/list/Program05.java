package com.sunbeam.collections.list;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Program05 {

	public static void main(String[] args) {
		List<Integer> l1 = new CopyOnWriteArrayList<>();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		l1.add(50);

		// fail-safe iterators
		Iterator<Integer> itr = l1.iterator();
		while (itr.hasNext()) {
			int element = itr.next();
			System.out.println("Element - " + element);
			if (element == 30)
				l1.add(60);
		}

		System.out.println("After Modification - ");
		for (Integer element : l1)
			System.out.println("Element - " + element);

	}

}

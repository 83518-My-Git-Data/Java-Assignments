package com.sunbeam.collections.list;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class Program01 {

	public static void main(String[] args) {

		List<Integer> l1 = new Vector<>();

		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		l1.add(50);

		for (Integer element : l1) {

			System.out.println(element);

		}

		System.out.println("Size of l1 - " + l1.size());

		System.out.println("Element present -  " + l1.contains(30));

		System.out.println("Element at index 4 - " + l1.get(4));

		System.out.println("Index of element 30 - " + l1.indexOf(30));

		System.out.println("Traversal Using for-loop");

		for (int i = 0; i < l1.size(); i++) {
			System.out.println("ELement - " + l1.get(i));
		}
		l1.remove(0);
		l1.remove(new Integer(20));
		System.out.println("Traversal Using iterator");
		Iterator<Integer> itr = l1.iterator();
		while (itr.hasNext()) {
			System.out.println("ELement - " + itr.next());

		}

		System.out.println("Traversal Using ListIterator");
		ListIterator<Integer> itr2 = l1.listIterator();
		while (itr2.hasNext())
			System.out.println("Element - " + itr2.next());

		System.out.println("Reverse Traversal Using ListIterator");
		ListIterator<Integer> itr3 = l1.listIterator(l1.size());
		while (itr3.hasPrevious())
			System.out.println("Element - " + itr3.previous());

	}

}

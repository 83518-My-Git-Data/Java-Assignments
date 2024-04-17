package com.sunbeam.collections.list.ownobj;

import java.util.Enumeration;
import java.util.Vector;

public class Program1 {

	public static void main(String[] args) {
			Vector<Integer> v1 = new Vector<>();
			for (int i = 1; i <= 10; i++)
				v1.add(10 * i);

			System.out.println("using for-each -->");
			for (Integer element : v1)
				System.out.println(element);

			System.out.println("using enumeration -->");
			Enumeration<Integer> en = v1.elements();
			while (en.hasMoreElements())
				System.out.println(en.nextElement());

			System.out.println("Size of vector - " + v1.size());
			System.out.println("Capacity of vector - " + v1.capacity());

			for (int i = 1; i <= 10; i++)
				v1.add(100 * i);

			v1.add(2000);

			System.out.println("Size of vector - " + v1.size());
			System.out.println("Capacity of vector - " + v1.capacity());
		

	}

}

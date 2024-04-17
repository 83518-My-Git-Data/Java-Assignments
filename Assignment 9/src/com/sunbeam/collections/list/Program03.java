package com.sunbeam.collections.list;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Program03 {

	public static void main(String[] args) {

		List<Student> studList = new LinkedList<>();

		studList.add(new Student(1, "Ronak", 99.99));
		studList.add(new Student(2, "Harish", 80.91));
		studList.add(new Student(3, "Ayush", 79.01));
		studList.add(new Student(4, "Atharva", 87.09));
		studList.add(new Student(5, "Rohit", 90.10));

		System.out.println("Before Sort - ");
		for (Student element : studList) {
			System.out.println(element);
		}

		Collections.sort(studList);

		System.out.println("After Natural Ordering Sort - ");
		for (Student element : studList) {
			System.out.println(element);
		}

		System.out.println("Sorting on Student Name: ");

		class StudentNameComparator implements Comparator<Student> {

			@Override
			public int compare(Student o1, Student o2) {
				return o1.name.compareTo(o2.name);
			}

		}

		Comparator<Student> studNameComparator = new StudentNameComparator();

		Collections.sort(studList, studNameComparator);

		for (Student element : studList) {
			System.out.println(element);
		}

		System.out.println("Checking if the Student exists through contains: ");

		Student s = new Student();

		s.rollno = 3;

		if (studList.contains(s)) {
			System.out.println("Student Exists");

		}

		else {
			System.out.println("Student Does not Exist");
		}

	}

}

package q2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

import sortingAlgorithm.SelectionSort;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;

		Student arr[] = new Student[5];

		arr[0] = new Student(1, "Ronak", "Jalgaon", 98.09);
		arr[1] = new Student(2, "Harish", "SambhajiNagar", 96.09);
		arr[2] = new Student(3, "Ayush", "Chattisgarh", 95.70);
		arr[3] = new Student(4, "Abhay", "Nagpur", 97.09);
		arr[4] = new Student(5, "Rohit", "Kolhapur", 98.09);

		do {
			System.out.println("1. sorted on their city (asc)");
			System.out.println("2. sorted on their on marks (desc)");
			System.out.println("3. sorted on their on name (asc)");
			System.out.println("4. Exit");
			System.out.print("Enter your choice: ");
			choice = sc.nextInt();

			switch (choice) {
			case 1:

				System.out.println("Before Sorting: ");
				for (Student ele : arr) {
					System.out.println(ele.toString());
				}

				class SortCity implements Comparator<Student> {

					@Override
					public int compare(Student o1, Student o2) {
						int value = o1.getCity().compareTo(o2.getCity());
						return value;
					}
				}

				Comparator<Student> studentCityComparator = new SortCity();

				Arrays.sort(arr, studentCityComparator);

				System.out.println("After Sorting: ");
				for (Student ele : arr) {
					System.out.println(ele.toString());
				}

				break;
			case 2:

				System.out.println("Before Sorting: ");
				for (Student ele : arr) {
					System.out.println(ele.toString());
				}

				class SortMarks implements Comparator<Student> {

					@Override
					public int compare(Student o1, Student o2) {
						int value = Double.compare(o2.getMarks(), o1.getMarks());
						return value;
					}
				}

				Comparator<Student> studentMarksComparator = new SortMarks();

				Arrays.sort(arr, studentMarksComparator);

				System.out.println("After Sorting: ");
				for (Student ele : arr) {
					System.out.println(ele.toString());
				}

				break;
			case 3:

				System.out.println("Before Sorting: ");
				for (Student ele : arr) {
					System.out.println(ele.toString());
				}

				class SortName implements Comparator<Student> {

					@Override
					public int compare(Student o1, Student o2) {
						int value = o1.getName().compareTo(o2.getName());
						return value;
					}
				}

				Comparator<Student> studentNameComparator = new SortName();

				Arrays.sort(arr, studentNameComparator);

				System.out.println("After Sorting: ");
				for (Student ele : arr) {
					System.out.println(ele.toString());
				}

				break;
			case 4:
				System.out.println("Thankyou For using the App :)");
				break;
			default:
				System.out.println("Invalid choice. Please try again.");
				break;
			}
		} while (choice != 4);

	}

}

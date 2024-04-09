package tester;

import java.util.Scanner;

import com.app.geometry.Point2D;

public class TestPointArray1 {

	public static void main(String[] args) {

		int choice, index;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter No of Points to Plot: ");
		int size = sc.nextInt();

		Point2D[] points = new Point2D[size];

		for (int i = 0; i < points.length; i++) {
			points[i] = new Point2D();
			System.out.print("Enter the Point x" + (i + 1) + ": ");
			double x = sc.nextDouble();
			points[i].setX(x);
			System.out.print("Enter the Point y" + (i + 1) + ": ");
			double y = sc.nextDouble();
			points[i].setY(y);
		}

		do {

			System.out.println("1. Display details of a specific point");
			System.out.println("2. Display x, y co-ordinates of all points");
			System.out.println("3. User i/p : 2 indices for the points , validate the indices");
			System.out.println("4. Exit");
			System.out.print("Enter the choice: ");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.print("Enter the Index: ");
				index = sc.nextInt();
				if (index > 0) {

					for (int i = 0; i < points.length; i++) {
						if (i == index) {
							System.out.println(points[i].getDetails());
						}
					}
				}
				break;

			case 2:
				for (Point2D ele : points) {
					System.out.println(ele.getDetails());
				}
				break;

			case 3:
				System.out.println("Enter index of starting point and end point");

				int index1, index2;
				System.out.print("Enter the index1: ");
				index1 = sc.nextInt();
				System.out.print("Enter the index2: ");
				index2 = sc.nextInt();
				if (index1 >= 0 && index1 < points.length && index2 >= 0 && index2 < points.length) {
					if (points[index1].isEqual(points[index2])) {
						System.out.println("The Points are located at the Same Location");
					} else {
						System.out.println("The Distance Between Points P1: " + points[index1].getDetails() + " &  P2: "
								+ points[index2].getDetails() + " is "
								+ points[index1].calcualateDistance(points[index2]));
					}
				} else {
					System.out.println("Enter Valid Indexes");
				} 
				break;

			case 4:
				System.out.println("Thankyou for Using the App.");
				break;

			default:

				System.out.println("Enter Valid Input");
				break;
			}
		} while (choice != 4);
		sc.close();

	}

}

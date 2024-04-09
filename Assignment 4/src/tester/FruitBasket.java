package tester;

import java.util.Scanner;

import com.app.fruits.Apple;
import com.app.fruits.Fruit;
import com.app.fruits.Mango;
import com.app.fruits.Orange;

public class FruitBasket {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter how many Fruits you want to buy: ");
		int count;
		count = sc.nextInt();
		Fruit basket[] = new Fruit[count];
		Fruit f;

		int counter = 0;
		int choice;
		do {
			System.out.println("0. Exit");
			System.out.println("1. Add Mango");
			System.out.println("2. Add Orange");
			System.out.println("3. Add Apple");
			System.out.println("4. Display Names of All Fruits in the Basket");
			System.out.println("5. Display name,color,weight ,taste of all fresh fruits , in the basket.");
			System.out.println("6. Display tastes of all stale(not fresh) fruits in the basket");
			System.out.println("7. Mark a fruit as stale");
			System.out.println("8. Mark all sour fruits stale");

			choice = sc.nextInt();
			String name;
			double weight;
			String color;

			switch (choice) {
			case 0:
				System.out.println("Thank you for using our App!");
				break;
			case 1:
				if (counter < count) {

					System.out.print("Enter the Name of the Fruit: ");
					name = sc.next();
					System.out.print("Enter the Weight of the Fruit: ");
					weight = sc.nextDouble();
					System.out.print("Enter the Color of the Fruit: ");
					color = sc.next();
					basket[counter++] = new Mango(name, weight, color);
				}
				break;
			case 2:
				if (counter < count) {

					System.out.print("Enter the Name of the Fruit: ");
					name = sc.next();
					System.out.print("Enter the Weight of the Fruit: ");
					weight = sc.nextDouble();
					System.out.print("Enter the Color of the Fruit: ");
					color = sc.next();
					basket[counter++] = new Orange(name, weight, color);

				}
				break;
			case 3:
				if (counter < count) {

					System.out.print("Enter the Name of the Fruit: ");
					name = sc.next();
					System.out.print("Enter the Weight of the Fruit: ");
					weight = sc.nextDouble();
					System.out.print("Enter the Color of the Fruit: ");
					color = sc.next();
					basket[counter++] = new Apple(name, weight, color);

				}
				break;

			case 4:

				for (Fruit fruit : basket) {
					if (fruit != null) {
						System.out.println("The Name of the Fruit is: " + fruit.getName());
					} else {
						break;
					}
				}

				break;

			case 5:

				for (Fruit fruit : basket) {
					if (fruit != null) {

						fruit.display();
						System.out.println("The taste of the Fruit is: " + fruit.taste());

					} else {
						break;
					}
				}
				break;

			case 6:
				for (Fruit fruit : basket) {
					if (fruit != null) {
						if (!(fruit.getIsFresh())) {
							System.out.println(
									"The taste of the Stale Fruit " + fruit.getName() + " is: " + fruit.taste());
						}
					} else {
						break;
					}
				}

				break;

			case 7: {

				System.out.println("Enter the Index of the Fruit you want Stale: ");
				int input = sc.nextInt();
				if (input < counter) {
					basket[input].setFresh(false);
				}
			}
				break;

			case 8:
				for (Fruit fruit : basket) {
					if (fruit != null) {
						if (fruit.taste().equals("sour")) {
							fruit.setFresh(false);
						}
					} else {
						break;
					}
				}
				break;

			default:
				System.out.println("Wrong Choice..");
				break;
			}
		} while (choice != 0);

	}

}

package tester;

import q2.Car;

public class CarTest {

	public static void main(String[] args) {
		Car c = new Car();
		
		c.accept();
		c.display();
		System.out.println("The total Bill of the given Car is : " + c.calculateCost()); 

	}

}

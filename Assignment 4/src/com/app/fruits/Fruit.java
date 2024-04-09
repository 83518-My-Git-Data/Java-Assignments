package com.app.fruits;

import java.util.Scanner;

public class Fruit {
	Scanner sc = new Scanner(System.in);

	private String color;
	private double weight;
	private String name;
	private boolean isFresh = true;

	public Fruit() {
	}

	public Fruit(String name, double weight, String color) {

		this.color = color;
		this.weight = weight;
		this.name = name;
		this.setFresh(isFresh);
	}

	public boolean getIsFresh() {
		return isFresh;
	}

	public void setFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}

	public void Accept() {
		System.out.println("Enter the Name of the Fruit: ");
		name = sc.next();
		System.out.println("Enter the Weight of the Fruit: ");
		weight = sc.nextDouble();
		System.out.println("Enter the Color of the Fruit: ");
		color = sc.next();
	}

	public void display() {
		System.out.println("The Name of the Fruit is: " + name);
		System.out.println("The Color of the Fruit is: " + color);
		System.out.println("The Weight of the Fruit is: " + weight);

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

//	public boolean isFruitFresh() {
//
//		System.out.println("Enter if the Fruit is Fresh or Stale: 1. Fresh 2. Stale");
//		int status = sc.nextInt();
//		if (status == 1) {
//			isFresh = true;
//			return true;
//		} else {
//			isFresh = false;
//			return false;
//		}
//
//	}

	public String taste() {
		return "no specific taste";
	}

}

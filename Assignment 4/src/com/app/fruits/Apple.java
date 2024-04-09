package com.app.fruits;

public class Apple extends Fruit {

	public Apple(String name, double weight, String color) {

		super(name, weight, color);
	}

	public String taste() {
		super.taste();
		return "sweet n sour";
	}
}

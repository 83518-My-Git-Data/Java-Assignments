package com.app.fruits;

public class Orange extends Fruit {

	public Orange(String name, double weight, String color) {
		super(name, weight, color);
	}

	public String taste() {
		super.taste();
		return "sour";
	}

}

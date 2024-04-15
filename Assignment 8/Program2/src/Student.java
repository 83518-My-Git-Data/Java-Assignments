package q2;

import java.util.Scanner;

public class Student {

	Scanner sc = new Scanner(System.in);

	private int roll;
	private String name;
	private String city;
	private double marks;

	public int getRoll() {
		return roll;
	}

	public String getName() {
		return name;
	}

	public String getCity() {
		return city;
	}

	public double getMarks() {
		return marks;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	public Student(int roll, String name, String city, double marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.city = city;
		this.marks = marks;
	}

	@Override
	public String toString() {

		return "Roll number: " + roll + ", Name: " + name + ", City: " + city + ", Marks: " + marks;
	}

	public void display() {
		System.out.println("Roll number: " + roll);
		System.out.println("Name: " + name);
		System.out.println("City: " + city);
		System.out.println("Marks: " + marks);
	}

	public void accept() {
		System.out.print("Enter roll number: ");
		roll = sc.nextInt();

		System.out.print("Enter name: ");
		name = sc.next();

		System.out.print("Enter city: ");
		city = sc.next();

		System.out.print("Enter marks: ");
		marks = sc.nextDouble();

	}

}

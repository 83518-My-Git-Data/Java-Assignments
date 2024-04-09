package com.sunbeam.company;

import java.util.Scanner;

public abstract class Employee {
	Scanner sc = new Scanner(System.in);

	private String firstName;
	private String lastName;
	private int ssn;

	public Employee() {

	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getSsn() {
		return ssn;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

	@Override
	public String toString() {
		String s = " FirstName: " + firstName + " LastName: " + lastName + " Social Security Number: " + ssn;
		return s;
	}

	public void AcceptEmployee() {
		System.out.print("Enter the First Name of the Employee: ");
		firstName = sc.next();

		System.out.print("Enter the Last Name of the Employee: ");
		lastName = sc.next();

		System.out.print("Enter the Social Security Number: ");
		ssn = sc.nextInt();
	}

	

	public abstract double calculateSalary(); // abstract method

}

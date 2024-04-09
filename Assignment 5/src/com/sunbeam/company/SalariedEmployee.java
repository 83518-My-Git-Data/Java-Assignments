package com.sunbeam.company;

public class SalariedEmployee extends Employee {

	private double weeklySalary;

	public SalariedEmployee() {

	}

	public double getWeeklySalary() {
		return weeklySalary;
	}

	public void setWeeklySalary(double weeklySalary) {
		this.weeklySalary = weeklySalary;
	}

	public void AcceptEmployee() {
		super.AcceptEmployee();
		System.out.print("Enter the Weekly Salary");
		weeklySalary = sc.nextDouble();

	}

	@Override
	public String toString() {
		return super.toString();
		//+ " Weekly Salary: " + weeklySalary;
	}

	@Override
	public double calculateSalary() {
		return weeklySalary;

	}

}

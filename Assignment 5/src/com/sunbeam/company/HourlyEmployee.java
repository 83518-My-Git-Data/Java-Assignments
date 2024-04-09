package com.sunbeam.company;

public class HourlyEmployee extends Employee {

	private double wage;
	private int hours;

	public HourlyEmployee() {
	}

	public double getWage() {
		return wage;
	}

	public int getHours() {
		return hours;
	}

	public void setWage(double wage) {
		this.wage = wage;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public void AcceptEmployee() {
		super.AcceptEmployee();
		System.out.print("Enter the Hourly Wage: ");
		wage = sc.nextDouble();
		System.out.print("Enter the Hours Worked: ");
		hours = sc.nextInt();

	}
	@Override
	public String toString() {
		return super.toString() + " Hourly Wage: " + wage + " Hours Worked: " +hours;
	}

	@Override
	public double calculateSalary() {

		if (hours <= 40) {
			return wage * hours;
		} else if (hours > 40) {
			return 40 * wage + (hours - 40) * wage * 1.5;
		}

		return 0;

	}

}

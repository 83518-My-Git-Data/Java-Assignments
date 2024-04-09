package com.sunbeam.company;

public class BasePlusCommissionEmployee extends CommissionEmployee {

	private double baseSalary;

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public void AcceptEmployee() {
		super.AcceptEmployee();
		System.out.print("Enter the Base Salary: ");
		baseSalary = sc.nextDouble();

	}
	
	@Override
	public String toString() {
		return super.toString() +" Base Salary: "+ baseSalary;
	}

	@Override
	public double calculateSalary() {

		return (getCommissionRate() * getGrossSales()) + (baseSalary * 0.10 + baseSalary);

	}

}

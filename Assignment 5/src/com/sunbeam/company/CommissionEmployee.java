package com.sunbeam.company;

public class CommissionEmployee extends Employee {

	private double grossSales;
	private double commissionRate;

	public double getGrossSales() {
		return grossSales;
	}

	public double getCommissionRate() {
		return commissionRate;
	}

	public void setGrossSales(double grossSales) {
		this.grossSales = grossSales;
	}

	public void setCommissionRate(double commissionRate) {
		this.commissionRate = commissionRate;
	}

	public void AcceptEmployee() {
		super.AcceptEmployee();
		System.out.print("Enter the Gross Sales: ");
		grossSales = sc.nextDouble();

		System.out.print("Enter the Commission Rate: ");
		commissionRate = sc.nextDouble();

	}
	
	@Override
	public String toString() {
		return super.toString() + " Gross Sales: " + grossSales + " Commission Rate: " + commissionRate;
	}

	@Override
	public double calculateSalary() {

		return commissionRate * grossSales;

	}

}

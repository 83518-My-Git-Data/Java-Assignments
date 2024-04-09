package tester;

import java.util.Scanner;

import com.sunbeam.company.BasePlusCommissionEmployee;
import com.sunbeam.company.CommissionEmployee;
import com.sunbeam.company.Employee;
import com.sunbeam.company.HourlyEmployee;
import com.sunbeam.company.SalariedEmployee;

public class EmployeeTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int choice;
		System.out.println("Enter the Type of Employee: ");
		System.out.println("1. Salaried-Employee");
		System.out.println("2. Hourly-Employee");
		System.out.println("3. Commissioned-Employee");
		System.out.println("4. BasePlus-Commissioned-Employee");
		choice = sc.nextInt();

		if (choice == 1) {
			Employee e = new SalariedEmployee();
//			SalariedEmployee se = (SalariedEmployee) e;
			e.AcceptEmployee();
			System.out.println(e.toString());
			System.out.println(" Salaried Employee Salary: " + e.calculateSalary());

		} else if (choice == 2) {
			Employee e = new HourlyEmployee();
			//HourlyEmployee he = (HourlyEmployee) e;
			e.AcceptEmployee();
			System.out.println(e.toString());
			System.out.println(" Hourly Employee Salary: " + e.calculateSalary());


		}

		else if (choice == 3) {
			Employee e = new CommissionEmployee();
			//CommissionEmployee ce = (CommissionEmployee) e;
			e.AcceptEmployee();
			System.out.println(e.toString());
			System.out.println(" Commisioned Employee Salary: " + e.calculateSalary());

		} else if (choice == 4) {
			CommissionEmployee e = new BasePlusCommissionEmployee();
			BasePlusCommissionEmployee bce = (BasePlusCommissionEmployee) e; //downcastin
			bce.AcceptEmployee();
			System.out.println(bce.toString());
			System.out.println(" BaseplusCommision Employee Salary: " + bce.calculateSalary());


		}
	}

}

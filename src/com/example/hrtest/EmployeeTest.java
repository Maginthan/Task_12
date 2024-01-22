package com.example.hrtest;

import java.util.Scanner;

import com.example.hr.Employee;

//import com.example.hr.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Get user inputs for Name,ID, Salary
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your employee name: ");
		String name = sc.next();

		System.out.println("Please enter your employee ID: ");
		int id = sc.nextInt();

		System.out.println("Please enter your employee salary: ");
		Double salary = sc.nextDouble();

		// Creates instance of Employee class by importing the package
		Employee ep = new Employee(name, id, salary);
		System.out.println("------------------------------------------");
		ep.printName();
		System.out.println("------------------------------------------");
		ep.printSalary();
	}

}

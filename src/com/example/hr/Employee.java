package com.example.hr;

public class Employee {

	String Name;
	int ID;
	Double Salary;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	// Constructor to set the user input to the class properties
	public Employee(String name, int id, Double salary) {
		this.Name = name;
		this.ID = id;
		this.Salary = salary;
	}

	// Method prints the employee name
	public void printName() {
		System.out.println("The name of the employee entered is " + Name);
	}

	// Method prints the employee salary
	public void printSalary() {
		System.out.println("The salary of the employee entered is " + String.format("%.2f", Salary));
	}

}

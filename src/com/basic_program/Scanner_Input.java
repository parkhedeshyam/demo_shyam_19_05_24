package com.basic_program;

import java.util.Scanner;

public class Scanner_Input {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter name:");
		// String input
		String name = myObj.nextLine();

		System.out.println("Enter age:");
		// Numerical input
		int age = myObj.nextInt();

		System.out.println("Enter salary:");
		double salary = myObj.nextDouble();
		// Output input by user
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Salary: " + salary);// TODO Auto-generated method stub

	}

}

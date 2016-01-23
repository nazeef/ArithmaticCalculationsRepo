package com.persistent.ArithmeticOperations.Application;

import java.util.Scanner;

import com.persistent.ArithmeticOperations.serviceImpl.ArithmeticOperationsImpl;

public class ApplicationDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//////////
		 ArithmeticOperationsImpl fact = new  ArithmeticOperationsImpl();
		 System.out.println("Enter the number : ");
		 Scanner in = new Scanner(System.in);
		 int n = in.nextInt();
		 System.out.println("Factorial of " + n + " is " + fact.factorial(n));
		 
		System.out.print("vaibhav");
		System.out.print("conflict");
		//vgdgfsdf
		

	}

}

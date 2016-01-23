package com.persistent.ArithmeticOperations.Application;

import java.util.Scanner;

import com.persistent.ArithmeticOperations.serviceImpl.ArithmeticOperationsImpl;

public class ApplicationDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		 ArithmeticOperationsImpl arithmeticOperations = new  ArithmeticOperationsImpl();
		 
		 //----------handling input-----------------------
		 
		 System.out.println("Enter the number : ");
		 Scanner in = new Scanner(System.in);
		 int num = in.nextInt();
		 
		 //--------------------------------------------------
		 
		 System.out.println("Factorial of " + num + " is " + arithmeticOperations.factorial(num));
		 
		 arithmeticOperations.primeNumbers(num);

	}

}

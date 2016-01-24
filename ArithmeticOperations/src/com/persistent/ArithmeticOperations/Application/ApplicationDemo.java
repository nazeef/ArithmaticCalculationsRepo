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
		 
		 System.out.println("Enter the 2 numbers : ");
		 Scanner in = new Scanner(System.in);
		 int num = in.nextInt();
		 int number=in.nextInt();
		 in.close();
		 //--------------------------------------------------
		 
		 System.out.println("Factorial of " + num + " is " + arithmeticOperations.factorial(num));
		 
		 arithmeticOperations.primeNumbers(num);
		
		 arithmeticOperations.OddEven(number);
		 
		 System.out.println("product of " + num + "*" + number + " = " + arithmeticOperations.product(num,number));
		 
		 System.out.println("division of " + num + "/" + number + " = " + arithmeticOperations.divide(num,number));

		 System.out.println("square root of " + number + " = " + arithmeticOperations.squareRoot(number));

	}

}

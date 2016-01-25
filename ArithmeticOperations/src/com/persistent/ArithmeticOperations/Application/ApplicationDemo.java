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
		 
		 try{
			 System.out.println("division of " + num + "/" + number + " = " + arithmeticOperations.divide(num,number));
		 }
		 catch(ArithmeticException ex){
			 System.out.println("-------->   Caught Exception :"+ex.getMessage());
		 }
		 
		 
		 
		 
		 System.out.println("square root of " + number + " = " + arithmeticOperations.squareRoot(number));



		// TODO Auto-generated method stub
		System.out.println("Nazeef print");
		System.out.println("Nazeef print");

		
		//calculate sum
		 System.out.println("Enter the 2 numbers : ");
		 Scanner inp = new Scanner(System.in);
		 int num1 = in.nextInt();
		 int num2=in.nextInt();
		 in.close();
		 
		System.out.println("sum of " + num1 + "+" + num2 + " = " + arithmeticOperations.add(num1, num2));
		 
		 
		 
		 
		 

		 System.out.println("-----demo------");

	}

}

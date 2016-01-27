package com.persistent.ArithmeticOperations.Application;

import java.util.Scanner;

import com.persistent.ArithmeticOperations.serviceImpl.ArithmeticOperationsImpl;
import com.persistent.ArithmeticOperations.util.FileReaderUtil;

public class ApplicationDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		 Scanner in = new Scanner(System.in);
		 ArithmeticOperationsImpl arithmeticOperations = new  ArithmeticOperationsImpl();
		 
		 //----------handling input-----------------------
		 System.out.println("Enter a number to reverse: ");
		 int n1 = in.nextInt();
		 System.out.println("Reverse of " + n1 + " is " + arithmeticOperations.reverse(n1));
		 System.out.println(n1 + " is " + arithmeticOperations.palindrome(n1));
		 
		 System.out.println("Enter a number to find the factorial: ");
		 int n = in.nextInt();
		 System.out.println("Factorial of " + n + " is " + arithmeticOperations.factorial(n));
		 
		 System.out.println("Enter a number to find if its armstrong: ");
		 int arNum=in.nextInt();
		 System.out.println(arNum + " is " + arithmeticOperations.armstrong(arNum));
		 
		 
		 
		 System.out.println("Enter the 2 numbers : ");
		 int num = in.nextInt();
		 int number=in.nextInt();
		
		 
		 //-------------------File Input -------------------------------
		 
		 FileReaderUtil fileReader = new FileReaderUtil();
		 String fileName = "src\\demo.txt";
		 arithmeticOperations.primeNumbers(Integer.parseInt(fileReader.readFile(fileName)));
		
		 //------------------------------------------------------
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


		//calculate sum
		 System.out.println("Enter the 2 numbers : ");
		 
		 int num1 = in.nextInt();
		 int num2=in.nextInt();
		 
		System.out.println("sum of " + num1 + "+" + num2 + " = " + arithmeticOperations.add(num1, num2));
		System.out.println("remainder of " + num1 + "%" + num2 + " = " + arithmeticOperations.rem(num1, num2));
		System.out.println("quotient of " + num1 + "/" + num2 + " = " + arithmeticOperations.quot(num1, num2));
		 
		 
		
		//----armstrong-----------//
		

		 System.out.println("-----demo------");
		 in.close();

	}

}

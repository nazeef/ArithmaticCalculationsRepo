package com.persistent.ArithmeticOperations.Application;

import java.nio.file.Path;
import java.nio.file.Paths;
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
		 int n,n1;
		 

		 //----------handling input-----------------------
		 System.out.println("Enter a number to reverse: ");
		 n = in.nextInt();
		 System.out.println("Reverse of " + n + " is " + arithmeticOperations.reverse(n));
		 
		 System.out.println("Enter a number to find if its palindrome: ");
		 n = in.nextInt();
		 System.out.println(n + " is " + arithmeticOperations.palindrome(n));
		 
		 System.out.println("Enter a number to find the factorial: ");
		 n = in.nextInt();
		 System.out.println("Factorial of " + n + " is " + arithmeticOperations.factorial(n));
		 

		 System.out.println("Enter a number to find if its armstrong: ");
		 n=in.nextInt();
		 System.out.println(n + " is " + arithmeticOperations.armstrong(n));
		 
		 
		 System.out.println("Enter the 2 numbers to perform the basic operations on them : ");
		 n = in.nextInt();
		 n1=in.nextInt();
		 
		 System.out.println("Addition : " + n + "+" + n1 + " = " + arithmeticOperations.add(n, n1));

		 System.out.println("Product : " + n + "*" + n1 + " = " + arithmeticOperations.product(n,n1));
		 
		 try{
			 System.out.println("Division : " + n + "/" + n1 + " = " + arithmeticOperations.divide(n,n1));
			 
			 System.out.println("Remainder :  " + n + "%" + n1 + " = " + arithmeticOperations.rem(n, n1));
			 
			 System.out.println("Quotient : " + n + "/" + n1 + " = " + arithmeticOperations.quot(n, n1));
		 }
		 catch(ArithmeticException ex){
			 System.out.println("Caught Exception : "+ex.getMessage());
		 }
		 
		 System.out.println("Square root of " + n + " is " + arithmeticOperations.squareRoot(n)); 
		 System.out.println("Square root of " + n1 + " is " + arithmeticOperations.squareRoot(n1));
		 

		 arithmeticOperations.OddEven(n);
		 arithmeticOperations.OddEven(n1);
		
		 System.out.println("Printing prime nos , taking the input (range) from a file.");
		 FileReaderUtil fileReader = new FileReaderUtil();
		 String fileName = "C:\\Users\\scheweta_naik\\git\\ArithmaticCalculationsRepo\\ArithmeticOperations\\src\\demo.txt";
		 arithmeticOperations.primeNumbers(Integer.parseInt(fileReader.readFile(fileName)));
		
		 System.out.println("\n****Finding LCM of two numbers****\n\nEnter first number : ");
		 int a1 = in.nextInt();
		 System.out.println("\nEnter second number :  ");
		 int b1 = in.nextInt();
			
		System.out.println("LCM of "+a1+" and "+b1+" is "+arithmeticOperations.lcm(a1,b1));

	    in.close();
		
		
		
		

	}

}

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
		 
		 int choice;
		 do{
			 
		 System.out.println("Please Select Choice from below\n");
		 System.out.println("1. Revese and check for palindrom number");
		 System.out.println("2. Find Factorial of a number");
		 System.out.println("3. Find LCM of two numbers");
		 System.out.println("4. Perform some random operations on two numbers");
		 System.out.println("5. Prime number (input from file)");
		 System.out.println("6. Some more random operations on two numbers");
		 System.out.println("7. Exit\n");
							
		 choice = in.nextInt();
		 
		 switch(choice){
			 case 1:
				 System.out.println("Enter a number to reverse: ");
				 int n1 = in.nextInt();
				 System.out.println("Reverse of " + n1 + " is " + arithmeticOperations.reverse(n1));
				 System.out.println(n1 + " is " + arithmeticOperations.palindrome(n1));
				break;
				
			 case 2:
				 System.out.println("Enter a number to find the factorial: ");
				 int n = in.nextInt();
				 System.out.println("Factorial of " + n + " is " + arithmeticOperations.factorial(n));
				 break;
			 
			 case 3:
				 // lcm of two numbers
					//Scanner sc = new Scanner(System.in);
					
					System.out.println("\n****Finding LCM of two numbers****\n\nEnter first number : ");
					int a1 = in.nextInt();
					System.out.println("\nEnter second number :  ");
					int b1 = in.nextInt();
					
					System.out.println("LCM of "+a1+" and "+b1+" is "+arithmeticOperations.lcm(a1,b1));
				
					//sc.close();
					break;
			 case 4:
				//calculate sum
				 System.out.println("Enter the 2 numbers : ");
				// Scanner inp = new Scanner(System.in);
				 int num1 = in.nextInt();
				 int num2=in.nextInt();
				 
				System.out.println("sum of " + num1 + "+" + num2 + " = " + arithmeticOperations.add(num1, num2));
				System.out.println("remainder of " + num1 + "%" + num2 + " = " + arithmeticOperations.rem(num1, num2));
				System.out.println("quotient of " + num1 + "/" + num2 + " = " + arithmeticOperations.quot(num1, num2));
				 
				 in.close();
				 
				 break;
				 
			 case 5:
				 //-------------------File Input -------------------------------
				 
				 FileReaderUtil fileReader = new FileReaderUtil();
				 String fileName = "src\\demo.txt";
				 arithmeticOperations.primeNumbers(Integer.parseInt(fileReader.readFile(fileName)));
				
				 break;
				 
			 case 6:
				 System.out.println("Enter the 2 numbers : ");
					
				 int num = in.nextInt();
				 int number=in.nextInt();

				
				 
				 
				
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


				 break;
				 
		 }
		 
		 
		 
		 }while(choice<7);
		

		// TODO Auto-generated method stub

	}

}

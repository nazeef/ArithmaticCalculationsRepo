package com.persistent.ArithmeticOperations.serviceImpl;

import com.persistent.ArithmeticOperations.service.ArithmeticOperationsService;

public class ArithmeticOperationsImpl implements ArithmeticOperationsService{


	public int factorial(int number){
		//System.out.println("scheweta naik ");
		if(number==1 || number ==0)
			return 1;
		else
			return number*factorial(number-1);
	}

	//---------generate prime numbers between 1 and num-----------
	
	public void primeNumbers(int number) {
		
		int start=2, end=number, counter=0; 
		boolean isPrime;
		
		System.out.print("Prime numbers between 1 and "+number+" :");
		
		for(int num=start; num<=end; num++){           // loop through  1 to number
			isPrime=true;
			
			for(counter=2; counter<=num/2; counter++){
				if(num%counter == 0){
					isPrime = false;                  // if divisible by other numbers
					break;
				}
			}
			
			if(isPrime==true)                        
				System.out.print("  "+num);
		}
	}

	
	public int add(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1+num2;
	}
	
	
	//remainder 
	public int rem(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1num2;
	}
	
	//quotient
	public int quot(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1/num2;
	}
	
	
	
	
	
	//---- product of numbers ------//
 
	public int product(int firstNumber,int secondNumber){
		
		return Math.multiplyExact(firstNumber,secondNumber);
	}

	
	
	//------ classification between odd and even ------ //
	public void OddEven(int number){
		if(number % 2 == 0)
			System.out.println("\n"+ number + " is Even");
		else
			System.out.println("\n"+ number + " is Odd");
	}
	
	//------division of numbers------------//
	
	public double divide(int firstNumber,int secondNumber){
		return Math.floorDiv(firstNumber, secondNumber);
	}
	
	//---------square root of a number ----------//
	public double squareRoot(int firstNumber){
		return Math.sqrt(firstNumber);
	}
	

	public void prineNumbers(int num) {
		// TODO Auto-generated method stub
		
	}


}

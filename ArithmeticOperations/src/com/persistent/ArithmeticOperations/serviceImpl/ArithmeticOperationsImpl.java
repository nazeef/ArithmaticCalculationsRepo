package com.persistent.ArithmeticOperations.serviceImpl;

import com.persistent.ArithmeticOperations.service.ArithmeticOperationsService;

public class ArithmeticOperationsImpl implements ArithmeticOperationsService{


	//------factorial-------//
	public int factorial(int number){
		
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

	//-----------add--------------//
	public int add(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1+num2;
	}
	
	
	//----------armstrong------------//
	public boolean armstrong(int n){
		 int c=0,a,temp;
		 temp=n; 
		 while(n>0)  
		    {  
		    a=n%10;  
		    n=n/10;  
		    c=c+(a*a*a);  
		    }  
		    if(temp==c)  
		    return true;   
		    else  
		    	return false;   
		   } 
		
	
	
	
	//-----------remainder----------// 
	public int rem(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1%num2;
	}
	
	//------------quotient----------//
	public int quot(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1/num2;
	}
	
	
	
	
	
	//---- product of numbers ------//
 
	public int product(int firstNumber,int secondNumber){
		
		return Math.multiplyExact(firstNumber,secondNumber);
	}

	
	
	//------ classification between odd and even ------ //
	public boolean OddEven(int number){
		if(number % 2 == 0)
			return true;
		else
			return false;
	}
	
	//------division of numbers------------//
	
	public double divide(int firstNumber,int secondNumber){
		return Math.floorDiv(firstNumber, secondNumber);
	}
	
	//---------square root of a number ----------//
	public double squareRoot(int firstNumber){
		return Math.sqrt(firstNumber);
	}
	
	//--------reverse the digits in a number---//
	public int reverse(int number) {
		int rev=0;
		while(number>0){
			int r = number%10;
			rev = r + rev*10;
			number = number/10;
		}
		return rev;
	}


	//-----------palindrome---------------//
	public String palindrome(int number) {
		// TODO Auto-generated method stub
		if(number==reverse(number))
			return "a Palindrome";
		else
			return "not a Palindrome";
	}

	//---- Least Common Multiple ----\\
	public int lcm(int num1, int num2){
		return num1/gcd(num1,num2)*num2;
	}
	
	//---- Greatest Common Divisible ----\\
	public int gcd(int num1, int num2){
		if(num2 == 0)
			return num1;
		else
			return gcd(num2, num1%num2);
	}
	

}

package com.persistent.ArithmeticOperations.serviceImpl;

public class ArithmeticOperationsImpl implements ArithmeticOperationsService{

	public int factorial(int number){
		//System.out.println("scheweta naik ");
		if(number==1 || number ==0)
			return 1;
		else
			return number*factorial(number-1);
	}
}

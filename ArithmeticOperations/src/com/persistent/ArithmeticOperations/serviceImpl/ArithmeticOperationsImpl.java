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

	public void prineNumbers(int num) {
		// TODO Auto-generated method stub
		
	}

	public int add(int num1, int num2) {
		// TODO Auto-generated method stub
		return 0;
	}
}

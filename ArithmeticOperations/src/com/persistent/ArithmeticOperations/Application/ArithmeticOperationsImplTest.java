package com.persistent.ArithmeticOperations.Application;

import static org.junit.Assert.*;

import org.junit.Test;

import com.persistent.ArithmeticOperations.serviceImpl.ArithmeticOperationsImpl;

public class ArithmeticOperationsImplTest {

	ArithmeticOperationsImpl arithmaticOp=new ArithmeticOperationsImpl();


	public void testArmstrong(){
	assertEquals(false,arithmaticOp.armstrong(372));
	}
	
	public void testOddEven(){
		assertEquals(true, arithmaticOp.OddEven(2));
	}
}

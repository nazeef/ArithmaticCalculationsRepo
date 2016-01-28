package com.persistent.ArithmeticOperations.Application;

import static org.junit.Assert.*;

import org.junit.Test;

import com.persistent.ArithmeticOperations.serviceImpl.ArithmeticOperationsImpl;

public class ArithmeticOperationsImplTest {

	
	ArithmeticOperationsImpl arithmaticOp=new ArithmeticOperationsImpl();
	@Test
	public void testArmstrong() {
		assertEquals(false,arithmaticOp.armstrong(372));
		}

	@Test
	public void testOddEven() {
		assertEquals(true, arithmaticOp.OddEven(2));
	}

}

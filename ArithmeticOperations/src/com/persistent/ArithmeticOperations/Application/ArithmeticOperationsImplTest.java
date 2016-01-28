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

	@Test
	public void testadd() {
		assertEquals(2, arithmaticOp.add(1,1));
	}
	
	@Test
	public void testproduct() {
		assertEquals(12, arithmaticOp.product(3, 4));
	}
	
	@Test
	public void testrem() {
		assertEquals(0, arithmaticOp.rem(8, 4));
	}
	
	@Test
	public void testquot() {
		assertEquals(1, arithmaticOp.quot(45, 40));
	}
}

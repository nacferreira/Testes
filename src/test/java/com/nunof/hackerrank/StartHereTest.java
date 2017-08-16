package com.nunof.hackerrank;

import static org.junit.Assert.*;

import org.junit.Test;

public class StartHereTest {

	@Test
	public void test0Factorial() {	
		assertEquals("0 factorial should be 1", 1, StartHere.factorial(0));
	}
	
	@Test
	public void test1Factorial() {	
		assertEquals("1 factorial should be 1", 1, StartHere.factorial(1));
	}
	
	@Test (expected = IllegalArgumentException.class)
	//@Test
	public void testNegativeFactorial() {	
		StartHere.factorial(-10);
	}

}

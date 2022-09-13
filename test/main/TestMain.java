package main;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class TestMain {

	@Test
	void testFactorial() {
		assertEquals(1, Main.recursiveFactorial(0));
		assertEquals(1, Main.recursiveFactorial(1));
		assertEquals(2, Main.recursiveFactorial(2));
		assertEquals(6, Main.recursiveFactorial(3));
		assertEquals(24, Main.recursiveFactorial(4));
		assertEquals(120, Main.recursiveFactorial(5));
		assertEquals(720, Main.recursiveFactorial(6));
		assertEquals(5040, Main.recursiveFactorial(7));
		assertEquals(40320, Main.recursiveFactorial(8));
		assertEquals(362880, Main.recursiveFactorial(9));
		assertEquals(3628800, Main.recursiveFactorial(10));
	}
	
	@Test
	void testOdd() {
		assertFalse(Main.isOdd(0));
		assertTrue(Main.isOdd(1));
		assertFalse(Main.isOdd(2));
		assertTrue(Main.isOdd(3));
		assertFalse(Main.isOdd(4));
		assertTrue(Main.isOdd(5));
		assertFalse(Main.isOdd(6));
		assertTrue(Main.isOdd(7));
		assertFalse(Main.isOdd(8));
		assertTrue(Main.isOdd(9));
		assertFalse(Main.isOdd(10));
	}
	
	@Test
	void testFibonacci() {
		assertEquals(0, Main.fibonacci(1));
		assertEquals(1, Main.fibonacci(2));
		assertEquals(1, Main.fibonacci(3));
		assertEquals(2, Main.fibonacci(4));
		assertEquals(3, Main.fibonacci(5));
		assertEquals(5, Main.fibonacci(6));
	}
	
	@Test
	void testPowTwo() {
		assertEquals(1, Main.powTwo(0));
		assertEquals(8, Main.powTwo(3));
		assertEquals(16, Main.powTwo(4));
		assertEquals(32, Main.powTwo(5));
		assertEquals(64, Main.powTwo(6));
		assertEquals(128, Main.powTwo(7));
	}
	
	@Test
	void testRecursivePowTwo() {
		assertEquals(1, Main.recursivePowTwo(0));
		assertEquals(8, Main.recursivePowTwo(3));
		assertEquals(16, Main.recursivePowTwo(4));
		assertEquals(32, Main.recursivePowTwo(5));
		assertEquals(64, Main.recursivePowTwo(6));
		assertEquals(128, Main.recursivePowTwo(7));
	}

}

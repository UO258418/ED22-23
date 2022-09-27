package main;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class TestMain {
	
	@Test
	void testFactorial() {
		assertEquals(1, Main.factorial(0));
		assertEquals(1, Main.factorial(1));
		assertEquals(2, Main.factorial(2));
		assertEquals(6, Main.factorial(3));
		assertEquals(24, Main.factorial(4));
		assertEquals(120, Main.factorial(5));
		assertEquals(720, Main.factorial(6));
		assertEquals(5040, Main.factorial(7));
		assertEquals(40320, Main.factorial(8));
		assertEquals(362880, Main.factorial(9));
		assertEquals(3628800, Main.factorial(10));
	}

	@Test
	void testRecursiveFactorial() {
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
	void testReminder() {
		assertEquals(1, Main.reminder(10, 3));
		assertEquals(2, Main.reminder(20, 3));
		assertEquals(0, Main.reminder(50, 5));
		assertEquals(2, Main.reminder(10, 4));
		assertEquals(5, Main.reminder(77, 8));
	}
	
	@Test
	void testIntDivision() {
		assertEquals(5, Main.intDivision(10, 2));
		assertEquals(9, Main.intDivision(77, 8));
		assertEquals(11, Main.intDivision(33, 3));
		assertEquals(3, Main.intDivision(6, 2));
		assertEquals(20, Main.intDivision(100, 5));
	}
	
	@Test
	void testIterativeFibonacci() {
		assertEquals(0, Main.iterativeFibonacci(1));
		assertEquals(1, Main.iterativeFibonacci(2));
		assertEquals(1, Main.iterativeFibonacci(3));
		assertEquals(2, Main.iterativeFibonacci(4));
		assertEquals(3, Main.iterativeFibonacci(5));
		assertEquals(5, Main.iterativeFibonacci(6));
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
	void testIsSymmetric() {
		assertTrue(Main.isSymmetric(new int[][] {
			{1, 2, 3, 4},
			{2, 6, 7, 8},
			{3, 7, 11, 12},
			{4, 8, 12, 16}
		}));
		
		assertFalse(Main.isSymmetric(new int[][] {
			{1, 2, 3, 4},
			{3, 6, 7, 8},
			{3, 8, 11, 12},
			{4, 12, 12, 16}
		}));
		
		assertTrue(Main.isSymmetric(new int[][] {
			{1, 2, 3, 4, 5},
			{2, 1, 7, 8, 9},
			{3, 7, 1, 12, 13},
			{4, 8, 12, 1, 6},
			{5, 9, 13, 6, 1}
		}));
		
		assertFalse(Main.isSymmetric(new int[][] {
			{1, 2, 3, 4, 5},
			{2, 1, 7, 8, 9},
			{3, 7, 1, 12, 13},
			{4, 5, 12, 1, 6},
			{5, 9, 13, 6, 1}
		}));
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
	
	@Test
	void testLinearRecursivePowTwo() {
		assertEquals(1, Main.linearRecursivePowTwo(0));
		assertEquals(8, Main.linearRecursivePowTwo(3));
		assertEquals(16, Main.linearRecursivePowTwo(4));
		assertEquals(32, Main.linearRecursivePowTwo(5));
		assertEquals(64, Main.linearRecursivePowTwo(6));
		assertEquals(128, Main.linearRecursivePowTwo(7));
	}

}

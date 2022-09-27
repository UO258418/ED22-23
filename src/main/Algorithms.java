package main;

public class Algorithms {

	/**
	 * Linear complexity due to only one loop that increments by 1 each time
	 * 
	 * @param n
	 */
	public static void linear(long n) {
		for(int i = 0; i < n; i++)
			TestBench.doNothing(i);
	}
	
	/**
	 * Cuadratic complexity due to two loops that increment by 1 each time
	 * 
	 * @param n
	 */
	public static void cuadratic(long n) {
		for(int i = 0; i < n; i++)
			for(int j = 0; j < n; j++)
				TestBench.doNothing(i * n + j);
	}
	
	/**
	 * Cubic complexity due to three loops that increment by 1 each time
	 * 
	 * @param n
	 */
	public static void cubic(long n) {
		for(int i = 0; i < n; i++)
			for(int j = 0; j < n; j++)
				for(int k = 0; k < n; k++)
					TestBench.doNothing(i * n * n + j * n + k);
	}
	
	/**
	 * Logarithmic complexity due to one loop that increments by *2 each iteration
	 * 
	 * @param n
	 */
	public static void logarithmic(long n) {
		for(int i = 1; i < n; i *= 2)
			TestBench.doNothing(i);
	}
	
}

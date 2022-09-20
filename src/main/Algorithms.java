package main;

public class Algorithms {

	public static void linear(long n) {
		for(int i = 0; i < n; i++)
			TestBench.doNothing(i);
	}
	
	public static void cuadratic(long n) {
		for(int i = 0; i < n; i++)
			for(int j = 0; j < n; j++)
				TestBench.doNothing(i * n + j);
	}
	
	public static void cubic(long n) {
		for(int i = 0; i < n; i++)
			for(int j = 0; j < n; j++)
				for(int k = 0; k < n; k++)
					TestBench.doNothing(i * n * n + j * n + k);
	}
	
	public static void logarithmic(long n) {
		for(int i = 0; i < n; n*= 2)
			TestBench.doNothing(i);
	}
	
}

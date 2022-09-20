package main;

public class Main {
	
	public static void main(String... args) {
		/*System.out.println(factorial(4));
		System.out.println(recursiveFactorial(4));
		System.out.println(isOdd(10));
		System.out.println(intDivision(10, 3));
		System.out.println(reminder(10, 3));
		System.out.println("Fibonacci: " + fibonacci(6));
		System.out.println("PowTwo: " + powTwo(1));
		System.out.println("RecursivePowTwo: " + recursivePowTwo(3));
		System.out.println("LogarithmicRecursivePowTwo: " + linearRecursivePowTwo(5));*/
		
		// Test times
		/*Algorithms.linear(1000);
		Algorithms.cuadratic(1000);
		Algorithms.cubic(1000);
		Algorithms.logarithmic(1000);*/
		
		//TestBench.test("linear.txt", 3, 0, 50, "main.Algorithms", "linear");
		//TestBench.test("cuadratic.txt", 3, 0, 50, "main.Algorithms", "cuadratic");
		//TestBench.test("cubic.txt", 3, 0, 26, "main.Algorithms", "cubic");
		//TestBench.test("logarithmic.txt", 3, 0, 10000, "main.Algorithms", "logarithmic");
		
		System.out.println(isSymmetric(new int[][] {
			{1, 2, 3, 4},
			{2, 6, 7, 8},
			{3, 8, 11, 12},
			{4, 12, 12, 16}
		}));
		
		System.out.println(isSymmetric(new int[][] {
			{1, 2, 3, 4},
			{3, 6, 7, 8},
			{3, 8, 11, 12},
			{4, 12, 12, 16}
		}));
	}

	public static int factorial(int n) {
		int result = n;
		for(int i = n - 1; i >= 1; i--) {
			result *= i;
		}
		return result;
	}
	
	public static int recursiveFactorial(int n) {
		if(n <= 1) return 1;
		else return n * recursiveFactorial(n - 1);
	}
	
	
	public static boolean isOdd(int n) {
		if(n == 0) return false;
		else if(n == 1) return true;
		else return isOdd(n - 2);
	}
	
	public static int intDivision(int D, int d) {
		if(D < d) return 0;
		else return 1 + intDivision(D - d, d);
	}
	
	public static int reminder(int D, int d) {
		if(D < d) return D;
		else return reminder(D - d, d);
	}
	
	public static int fibonacci(int index) {
		if(index == 1) return 0;
		else if(index == 2) return 1;
		else {
			return fibonacci(index - 2) + fibonacci(index - 1);
		}
	}
	
	// TODO
	public static boolean isSymmetric(int[][] matrix) {
		if(matrix.length < 2)
			return true;
		
		if(matrix[matrix.length - 1][0] != matrix[0][matrix.length - 1]) {
			return false;
		}
			
		if(matrix.length - 2 < 0)
			return true;
		
		else {
			// Copy topside of matrix
			int[][] topMatrix = new int[matrix.length - 1][matrix.length - 1];
			for(int i = 0; i < matrix.length - 2; i++)
				for(int j = 0; j < matrix.length - 2; j++) {
					topMatrix[i][j] = matrix[i][j];
				}
			
			// Copy botside of matrix
			int[][] botMatrix = new int[matrix.length - 1][matrix.length - 1];
			for(int i = 1; i < matrix.length - 1; i++)
				for(int j = 1; j < matrix.length - 1; j++) {
					botMatrix[i][j] = matrix[i][j];
				}
			
			return isSymmetric(topMatrix) && isSymmetric(botMatrix);
		}
	}
	
	
	public static int powTwo(int exp) {
		int result = 1;
		for(int i = 0; i < exp; i++) 
			result *= 2;
		return result;
	}
	
	public static int recursivePowTwo(int exp) {
		return (exp == 1 || exp == 0) ? exp + 1 : 2 * recursivePowTwo(exp - 1);
	}
	
	public static int linearRecursivePowTwo(int exp) {
		return (exp == 0 || exp == 1 ) ? exp + 1 : exp%2 == 0 ? 4 * linearRecursivePowTwo(exp/2 - 1) * linearRecursivePowTwo(exp/2 - 1) : 8 * linearRecursivePowTwo(exp/2 - 1) * linearRecursivePowTwo(exp/2 - 1);
	}
	
	// TODO
	public static int logarithmicRecursivePowTwo(int exp) {
		return 0;
	}
	
}







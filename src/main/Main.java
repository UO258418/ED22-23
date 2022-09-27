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
		
		//TestBench.test("powTwo.txt", 3, 0, 100, "main.Main", "powTwo");
		
		System.out.println(isSymmetric(new int[][] {
			{1, 2, 3, 4},
			{2, 6, 7, 8},
			{3, 7, 11, 12},
			{4, 8, 12, 16}
		}));
		
		System.out.println(isSymmetric(new int[][] {
			{1, 2, 3, 4},
			{3, 6, 7, 8},
			{3, 8, 11, 12},
			{4, 12, 12, 16}
		}));
	}

	public static int factorial(int n) throws IllegalArgumentException {
		if(n < 0) throw new IllegalArgumentException("Number must be greater than 0");
		
		int result = n;
		
		if(n == 0) return 1;
		
		for(int i = n - 1; i >= 1; i--) {
			result *= i;
		}
		return result;
	}
	
	public static int recursiveFactorial(int n) throws IllegalArgumentException {
		if(n < 0) throw new IllegalArgumentException("Number must be greater than 0");
		
		if(n <= 1) return 1;
		else return n * recursiveFactorial(n - 1);
	}
	
	
	public static boolean isOdd(int n) throws IllegalArgumentException {
		if(n < 0) throw new IllegalArgumentException("Number must be greater than 0");
		
		if(n == 0) return false;
		else if(n == 1) return true;
		else return isOdd(n - 2);
	}
	
	public static int intDivision(int D, int d) throws IllegalArgumentException {
		if(D < 0 || d < 0) throw new IllegalArgumentException("Number must be greater than 0");
		
		if(D < d) return 0;
		else return 1 + intDivision(D - d, d);
	}
	
	public static int reminder(int D, int d) throws IllegalArgumentException {
		if(D < 0 || d < 0) throw new IllegalArgumentException("Number must be greater than 0");
		
		if(D < d) return D;
		else return reminder(D - d, d);
	}
	
	public static int iterativeFibonacci(int index) throws IllegalArgumentException {
		if(index <= 0) throw new IllegalArgumentException("Number must be greater than 0");
		
		int first = 0;
		int second = 1;
		int tmp = first;
		
		if(index == 1) return first;
		else if(index == 2) return second;
		else 
			for(int i = 2; i < index; i++) {
				tmp = first + second;
				first = second;
				second = tmp;
			}
		
		return tmp;
	}
	
	public static int fibonacci(int index) throws IllegalArgumentException {
		if(index <= 0) throw new IllegalArgumentException("Number must be greater than 0");
		
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
		
		else {
			// Copy topside of matrix
			int[][] topMatrix = new int[matrix.length - 1][matrix.length - 1];
			for(int i = 0; i < matrix.length - 1; i++)
				for(int j = 0; j < matrix.length - 1; j++) {
					topMatrix[i][j] = matrix[i][j];
				}
			
			// Copy botside of matrix
			int[][] botMatrix = new int[matrix.length - 1][matrix.length - 1];
			for(int i = 1; i < matrix.length; i++)
				for(int j = 1; j < matrix.length; j++) {
					botMatrix[i - 1][j - 1] = matrix[i][j];
				}
			
			return isSymmetric(topMatrix) && isSymmetric(botMatrix);
		}
	}
	
	
	public static long powTwo(long exp) throws IllegalArgumentException {
		if(exp < 0) throw new IllegalArgumentException("Number must be greater than 0");
		
		int result = 1;
		for(int i = 0; i < exp; i++) 
			result *= 2;
		return result;
	}
	
	public static long recursivePowTwo(long exp) throws IllegalArgumentException {
		if(exp < 0) throw new IllegalArgumentException("Number must be greater than 0");
		return (exp == 1 || exp == 0) ? exp + 1 : 2 * recursivePowTwo(exp - 1);
	}
	
	public static long linearRecursivePowTwo(long exp) throws IllegalArgumentException {
		if(exp < 0) throw new IllegalArgumentException("Number must be greater than 0");
		return (exp == 0 || exp == 1 ) ? exp + 1 : exp%2 == 0 ? 4 * linearRecursivePowTwo(exp/2 - 1) * linearRecursivePowTwo(exp/2 - 1) : 8 * linearRecursivePowTwo(exp/2 - 1) * linearRecursivePowTwo(exp/2 - 1);
	}
	
	// TODO
	public static int logarithmicRecursivePowTwo(int exp) {
		return 0;
	}
	
}







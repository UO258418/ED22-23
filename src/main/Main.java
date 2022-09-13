package main;

public class Main {
	
	public static void main(String... args) {
		System.out.println(factorial(4));
		System.out.println(recursiveFactorial(4));
		System.out.println(isOdd(10));
		System.out.println(intDivision(10, 3));
		System.out.println(reminder(10, 3));
		System.out.println("Fibonacci: " + fibonacci(6));
		System.out.println("RowTwo: " + powTwo(0));
		System.out.println("RecursiveRowTwo: " + recursivePowTwo(0));
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
		return true;
	}
	
	
	public static int powTwo(int exp) {
		int result = 1;
		for(int i = 0; i < exp; i++) 
			result *= 2;
		return result;
	}
	
	public static int recursivePowTwo(int exp) {
		return (exp == 1 || exp == 0) ? 1 : 2 * powTwo(exp - 1);
	}
	
}







package main;

public class Main {
	
	public static void main(String... args) {
		System.out.println(factorial(4));
		System.out.println(recursiveFactorial(4));
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
	
}
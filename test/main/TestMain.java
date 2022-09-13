package main;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class TestMain {

	@Test
	void test() {
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

}

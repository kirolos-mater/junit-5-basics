package io.javabrains;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MathUtilsTest {

	@Test
	void testAdd() {
		MathUtils mathUtils = new MathUtils();
		int expected = 2;
		int actual = mathUtils.add(1, 1);
		assertEquals(expected, actual, "The add method should add two numbers");
	}
	
	@Test
	void testDivide() {
		MathUtils mathUtils = new MathUtils();
		assertThrows(ArithmeticException.class, () -> mathUtils.divide(1, 0), "Divide by zero should throw");
	}
	
	@Test
	void testComputeCircleRadius() {
		MathUtils mathUtils = new MathUtils();
		assertEquals(Math.PI * 100, mathUtils.computeCircleArea(10), "Should return right circle area");
	}

}

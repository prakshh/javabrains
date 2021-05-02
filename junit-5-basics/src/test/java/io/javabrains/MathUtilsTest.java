package io.javabrains;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

class MathUtilsTest {

	@Test
	void test() {
//		fail("Not yet implemented");
//		System.out.println("This test ran");
		MathUtils mathUtils = new MathUtils();
		int expected = 2;
		int actual = mathUtils.add(1,1);
		assertEquals(expected,actual,"The add method should add two numbers");
	}
	
	@Test
	void testDivide() {
		final MathUtils mathUtils = new MathUtils();
		assertThrows(ArithmeticException.class, new Executable() {
			public void execute() throws Throwable {
				mathUtils.divide(1, 0);
			}
		}, 
				"Divide should throw ArithmeticException when denominator is zero");
	}
	
	
	@Test
	void testComputeCircleArea() {
		MathUtils mathUtils = new MathUtils();
		assertEquals(314.1592653589793, mathUtils.computeCircleArea(10), "Should return right circle area");
	}

}

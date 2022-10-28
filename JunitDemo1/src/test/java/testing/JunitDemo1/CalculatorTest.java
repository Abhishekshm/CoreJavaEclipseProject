package testing.JunitDemo1;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {
	static int a, b;

	@BeforeClass
	public static void callFirst() {
		a = b = 50;
		System.out.println("The Sum of a and b are : ");
	}

	@Before
	public void beforeTestCase() {
		System.out.println("Before Test Case");
	}

	@Test
	public void add() {

		assertEquals("Test Case1 ", 100, new Calculator().add(a, b));
	}

	@Test
	public void add1() {

		assertEquals("Test Case1 ", 1001, new Calculator().add(a, b));
	}

	@Test
	public void sub() {
		assertEquals("Sub 1", 0, new Calculator().sub(a, b));
	}

	@After
	public void afterTestCase() {
		System.out.println("After Test Case");
	}

	@AfterClass
	public static void callLast() {
		a = b = 0;
		System.out.println("a and b are reset ");
	}

}

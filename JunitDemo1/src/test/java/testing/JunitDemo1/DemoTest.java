package testing.JunitDemo1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class DemoTest {

	@BeforeClass
	public static void callFirst() {
		System.out.println("Before all classes excuted excatly once ");
	}

	@Before
	public void beforeTestCase() {
		System.out.println("Before Test Case");
	}

	@Test
	public void test() {
		System.out.println("Inside Test 1");
	}

	@After
	public void afterTestCase() {
		System.out.println("After Test Case");
	}

	@AfterClass
	public static void callLast() {
		System.out.println("After all classes excuted excatly once ");
	}

}

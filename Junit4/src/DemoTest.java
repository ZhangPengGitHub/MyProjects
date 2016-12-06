import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * junittest
 * 
 * DemoTest.java
 * @author Roc
 * @date 2016-7-13ÉÏÎç8:19:11
 * @Email zp0016@qq.com
 */
/**
 * junittest
 * 
 * DemoTest.java
 * @author Roc
 * @date 2016-7-13ÉÏÎç8:19:11
 * @Email zp0016@qq.com
 */
/**
 * @author Roc
 *
 */
public class DemoTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link Demo#method1(int, int)}.
	 */
	@Test
	public void testMethod1() {
		assertEquals(10, Demo.method1(5, 5));
		//fail("Not yet implemented");
	}

	/**
	 * Test method for {@link Demo#method2(int, int)}.
	 */
	@Test
	public void testMethod2() {
		assertEquals(0, Demo.method2(5, 5));
		//fail("Not yet implemented");
	}

	/**
	 * Test method for {@link Demo#method3(int, int)}.
	 */
	@Test
	public void testMethod3() {
		assertEquals(1, Demo.method3(5, 5));
		//fail("Not yet implemented");
	}

}

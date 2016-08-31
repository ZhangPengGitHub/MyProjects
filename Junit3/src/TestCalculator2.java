import junit.framework.TestCase;

/**
 * junittest
 * 
 * TestCalculator.java
 * @author Roc
 * @date 2016-7-12обнГ4:14:00
 * @Email zp0016@qq.com
 */
public class TestCalculator2 extends TestCase{
	public static void test(){
		int result = Calculator.add(1, 2);
		assertEquals(3, result, 0);
	}
}

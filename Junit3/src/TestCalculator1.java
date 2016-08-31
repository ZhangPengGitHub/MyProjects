import junit.framework.TestCase;

/**
 * junittest
 * 
 * TestCalculator1.java
 * @author Roc
 * @date 2016-7-12обнГ4:13:46
 * @Email zp0016@qq.com
 */
public class TestCalculator1 extends TestCase{
	public static void test(){
		int result = Calculator.add(1, 2);
		assertEquals(3, result, 0);
	}
}

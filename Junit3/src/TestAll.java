import junit.framework.Test;
import junit.framework.TestSuite;
import junit.textui.TestRunner;

/**
 * junittest
 * 
 * TestAll.java
 * @author Roc
 * @date 2016-7-12ÏÂÎç4:27:20
 * @Email zp0016@qq.com
 */
public class TestAll extends TestSuite{
	public static Test test(){
		TestSuite suite = new TestSuite("TestSuite Test");
		suite.addTestSuite(TestCalculator1.class);
		suite.addTestSuite(TestCalculator2.class);
		return suite;
	}
	public static void main(String[] args){
		TestRunner.run(test());
	}

}

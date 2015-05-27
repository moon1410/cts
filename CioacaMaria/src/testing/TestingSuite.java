package testing;

import static org.junit.Assert.*;

import java.lang.annotation.Annotation;

import junit.framework.TestResult;
import junit.framework.TestSuite;

import org.junit.Before;
import org.junit.Test;

public class TestingSuite extends Object implements Test{

	TestSuite suite = new TestSuite(TestingCase.class, Testing.class);
    TestResult result = new TestResult();

    
	@Before
	public void setUp() throws Exception {
	}

	
	@Test
	public void test() {
	suite.run(result);
	System.out.println("Number of test cases = " + result.runCount());
	}

	@Override
	public Class<? extends Annotation> annotationType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Class<? extends Throwable> expected() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long timeout() {
		// TODO Auto-generated method stub
		return 0;
	}

}

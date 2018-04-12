package Homework4;

import static junitparams.JUnitParamsRunner.$;
import static org.junit.Assert.*;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class Problem_5_test {

	private Problem_5_calcY p5;
	

	@Before
	public void setUp () {
		p5 = new Problem_5_calcY();
	}
	
	//Parameters: (1,2,3,4)
	//			1-test case number, 2-x, 3-y, 4-basis path
	@Test
	@FileParameters("src/Homework4/Problem5.csv")
	public void test(int testcaseNumber, double x, double y, String bpNumber) {
		
		assertEquals(y, p5.calcY(x), 0.01);
	}

}

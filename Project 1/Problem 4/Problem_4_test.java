package Homework4;

import static junitparams.JUnitParamsRunner.$;
import static org.junit.Assert.*;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class Problem_4_test {
	
	Problem_4_isPrimeShipper p4;
	
	@SuppressWarnings("unused")
	private static final Object[] parametersForProblem4ClassTest () {
		return $(
//				Parameters are: (1,2,3,4,5)
//								1=total, 2=shippingCost, 3=numItems, 4=yearsCust, 5=a
//				Test case 1
				$(50000.01,   49.99,	9, 		11,		true),
//				Test case 2
				$(50000.00,   49.99,	9,		11,		false),
//				Test case 3
				$(50000.01,   50.00,	9, 		11,		false),
//				Test case 4
				$(50000.01,   49.99,	8, 		11,		false),
//				Test case 5
				$(50000.01,   49.99,	9, 		10,		false),
//				Test case 6
				$(0.00,   49.99,	9, 		10,		false),
//				Test case 7
				$(100000.00,   49.99,	9, 		11,		true),
//				Test case 8
				$(50000.01,   0.00,		9, 		11,		true),
//				Test case 9
				$(50000.01,   100.00,	9, 		11,		false),
//				Test case 10
				$(50000.01,   49.99,	0, 		11,		false),
//				Test case 11
				$(50000.01,   49.99,	20, 		11,		true),
//				Test case 12
				$(50000.01,   49.99,	9, 		0,		false),
//				Test case 13
				$(50000.01,   49.99,	9, 		50,		true)
		);
	}

	@Before
	public void setUp () {
		p4 = new Problem_4_isPrimeShipper();
	}
	
	@Test
	@Parameters(method="parametersForProblem4ClassTest")
	public void test(double total, double shippingCost, int numItems, int yearsCust, boolean a) {
		
		assertEquals(a, p4.isPrimeShipper(numItems, yearsCust, total, shippingCost));

	}
}
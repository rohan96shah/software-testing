package Homework5;

import static junitparams.JUnitParamsRunner.$;
import static org.junit.Assert.*;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class Problem_4_Test {
	
	private Problem4_countUniqueNums p4;
	
	@SuppressWarnings("unused")
	private static final Object[] parametersForProblem4ClassTest () {
		return $(
				//Parameters - (1, 2)
							// 1=num, 2=result
				// Test case 1
				$(new int [] {3,3,5,3,3}, 1),
				//Test case 2
				$(new int [] {0,0,0,0,0}, 0),
				// Test case 3
				$(new int [] {1,0,0,0,3}, 2),
				// Test case 4
				$(new int [] {-1,0,1,0,0}, 2),
				// Test case 5
				$(new int [] {0,0,1,0,-1}, 2),
				// Test case 6
				$(new int [] {0,-10,1,0,-1}, 2),
				// Test case 7
				$(new int [] {0,-9,1,0,-1}, 3),
				// Test case 8
				$(new int [] {0,9,1,0,-1}, 3),
				// Test case 9
				$(new int [] {0,10,1,0,-1}, 2)
				);
	}

@Before
public void setUp () {
	p4 = new Problem4_countUniqueNums();
}

@Test
@Parameters(method="parametersForProblem4ClassTest")
public void test(int[] num, int result) {

 
	p4.countUnique(num);

	assertEquals(result, p4.countUnique(num));
 
 
	}

}

package Homework5;

import static junitparams.JUnitParamsRunner.$;
import static org.junit.Assert.*;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class Problem_2_Test {

	private Problem2_sodaClass p2;	
	
	
	@SuppressWarnings("unused")
	private static final Object[] parametersForProblem2ClassTest () {
		return $(
//				Parameters are: (1,2,3,4,5,6,7)
//								1=State, 2=q, 3=s, 4=r, 5=d, 6=c, 7=m
//				Test case 1
				$(Problem2_sodaEnum.values()[1], 	false,		true,		false,	false,	false,	"Welcome"),
//				Test case 2
				$(Problem2_sodaEnum.values()[1], 	false,		false,		true,	false,	false,	"Welcome"),
//				Test case 3
				$(Problem2_sodaEnum.values()[1], 	true,		false,		false,	false,	false,	"25 cents credit"),
//				Test case 4
				$(Problem2_sodaEnum.values()[2], 	false,		false,		true,	false,	true,	"Welcome"),
//				Test case 5
				$(Problem2_sodaEnum.values()[2], 	false,		true,		false,	false,	false,	"25 cents credit"),
//				Test case 6
				$(Problem2_sodaEnum.values()[2], 	true,		false,		false,	false,	false,	"50 cents credit"),
//				Test case 7
				$(Problem2_sodaEnum.values()[3], 	false,		false,		true,	false,	true,	"25 cents credit"),
//				Test case 8
				$(Problem2_sodaEnum.values()[3], 	false,		true,		false,	false,	false,	"50 cents credit"),
//				Test case 9
				$(Problem2_sodaEnum.values()[3], 	true,		false,		false,	false,	false,	"75 cents credit"),
//				Test case 10
				$(Problem2_sodaEnum.values()[4], 	false,		false,		true,	false,	true,	"50 cents credit"),
//				Test case 11
				$(Problem2_sodaEnum.values()[4], 	true,		false,		false,	false,	false,	"75 cents credit"),
//				Test case 12
				$(Problem2_sodaEnum.values()[4], 	false,		true,		false,	true,	false,	"Welcome")
		);
	}

	
	@Test
	@Parameters(method="parametersForProblem2ClassTest")
	public void test1(Problem2_sodaEnum state, boolean q, boolean s, boolean r, boolean d, boolean c, String m) {
		
		p2 = new Problem2_sodaClass(m, c, d, state);
		
		
		p2.processState (q,s,r);
		
		assertEquals(d, p2.isD());
		assertEquals(c, p2.isC());
		assertEquals(m, p2.getM());
		
	}
}
package Homework4;

import static junitparams.JUnitParamsRunner.$;
import static org.junit.Assert.*;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class Problem_1_test {

	private Problem_1_setWarnings p1;
	
	@SuppressWarnings("unused")
	private static final Object[] parametersForProblem1ClassTest () {
		return $(
//				Parameters are: (1,2,3,4,5,6)
//								1=distance, 2=redLight, 3=yellowLight, 4=greenLight, 5=buzzer, 6=brakes
//				Test case 1
				$(200.0,   false,	false,	true,	false,	false),
//				Test case 2
				$(75.1,   false,	true,	false,	false,	false),
//				Test case 3
				$(25.0,   true,		true,	false,	false,	false),
//				Test case 4
				$(24.9,   true,		true,	false,	true,	true),
//				Test case 5
				$(300.0,   false,	false,	true,	false,	false),
//				Test case 6
				$(199.9,   false,	true,	false,	false,	false),
//				Test case 7
				$(75.0,   true,		true,	false,	false,	false),
//				Test case 8
				$(-0.1,   true,	true,	false,	true,	true)
		);
	}

	@Before
	public void setUp () {
		p1 = new Problem_1_setWarnings();
	}
	
	@Test
	@Parameters(method="parametersForProblem1ClassTest")
	public void test(double distance, boolean redLight, boolean yellowLight, boolean greenLight, boolean buzzer, boolean brakes) {
		
		p1.setBrakes(brakes);
		p1.setRedLight(redLight);
		p1.setYellowLight(yellowLight);
		p1.setGreenLight(greenLight);
		p1.setBuzzer(buzzer);
		
		p1.setWarnings(distance);
		
		
		assertEquals(redLight, p1.isRedLight());
		assertEquals(yellowLight, p1.isYellowLight());
		assertEquals(greenLight, p1.isGreenLight());
		assertEquals(buzzer, p1.isBuzzer());
		assertEquals(brakes, p1.isBrakes());
		
	}
}

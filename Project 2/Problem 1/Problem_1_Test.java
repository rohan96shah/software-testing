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
public class Problem_1_Test {

	private Problem1_microwaveClass p1;	
	
	
	
	@Before
	public void setup () {
		p1 = new Problem1_microwaveClass(false, 0);
	}

	//	Parameters are: (1,2,3,4,5,6,7)
	//	1=cooking, 2=stopButton, 3=startButton, 4=doorOpen, 5=timer, 6=expected_cooking, 7=expected_timer
	//Parameters 6 and 7 (expected_cooking, expected_timer) are the expected outputs
	@Test
	@FileParameters("src/Homework5/Problem_1.csv")
	public void test1(boolean cooking, boolean stopButton, boolean startButton, boolean doorOpen, int timer, boolean expected_cooking, int expected_timer) {
		
		p1.setCooking(cooking);
		p1.setTimer(timer);
		
		p1.operateMicrowave(stopButton, startButton, doorOpen);
		
		assertEquals(expected_cooking, p1.isCooking());
		assertEquals(expected_timer, p1.getTimer());
		
	}
}
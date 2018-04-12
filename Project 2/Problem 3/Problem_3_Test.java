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
public class Problem_3_Test {

	private Problem3_railroadClass p3;
	
	@Before
	public void setUp () {
		p3 = new Problem3_railroadClass();
	}
	
	//Parameters: (1,2,3,4)
	//			1-box in car no., 2-railroad car no., 3-shipment no., 4-Absolute box
	@Test
	@FileParameters("src/Homework5/Problem_3.csv")
	public void test(int boxInCarNum, int rrCarNum, int shipmentNum, int absBN) {
		
		assertEquals(absBN, p3.calcCurrBoxNumber(boxInCarNum, rrCarNum, shipmentNum));
		
	}

}

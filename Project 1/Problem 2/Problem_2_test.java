package Homework4;

import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class Problem_2_test {

	private Problem_2_GndCollWarnClass p2;
	private double altfeet;
	private boolean gearUp, gndCollCaut, gndCollWam, gndCollAlert, emerGD;

    @Before
	public void setUp() throws Exception {
    	p2 = new Problem_2_GndCollWarnClass();
	}

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {     
//			Parameters are: (1,2,3,4,5,6)
//			1=gearUp, 2=altfeet, 3=gndCollCaut, 4=gndCollWam, 5=gndCollAlert, 6=emerGD
//			Test case 1
            {true,   200.1,		true, 	false,	false,	false}, 
//			Test case 2
            {false,   200.1,	false, 	false,	false,	false}, 
//			Test case 3
            {true,   400.1,		false, 	false,	false,	false}, 
//			Test case 4
            {true,   100.1,		false, 	true,	false,	false}, 
//			Test case 5
            {true,   50.0,		false, 	false,	true,	true}, 
//			Test case 6
            {true,   50.1,		false, 	false,	true,	false}, 
//			Test case 7
            {true,   50000.0,	false, 	false,	false,	false}, 
//			Test case 8
            {true,   400.0,		true, 	false,	false,	false}, 
//			Test case 9
            {true,   200.0,		false, 	true,	false,	false}, 
//			Test case 10
            {true,   100.0,		false, 	false,	true,	false}, 
//			Test case 11
            {true,   0.0,		false, 	false,	true,	true}
       });
    }

    public Problem_2_test(boolean gearUp, double altfeet, boolean gndCollCaut, boolean gndCollWam, boolean gndCollAlert, boolean emerGD) {
    	this.gearUp = gearUp;
    	this.altfeet = altfeet;
    	this.gndCollCaut = gndCollCaut;
    	this.gndCollWam = gndCollWam;
    	this.gndCollAlert = gndCollAlert;
    	this.emerGD = emerGD;
    }
    
	@Test
	public void test() {
		
		p2.gndCollWarning(gearUp, altfeet);
		
		assertEquals(gndCollCaut, p2.isGndCollCaut());
		assertEquals(gndCollWam, p2.isGndCollWarn());
		assertEquals(gndCollAlert, p2.isGndCollAlert());
		assertEquals(emerGD, p2.isEmerGD());
		
		}
}

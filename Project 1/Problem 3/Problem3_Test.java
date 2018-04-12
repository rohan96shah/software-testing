package Homework4;
import static junitparams.JUnitParamsRunner.$;
import static org.junit.Assert.*;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class Problem_3_test {

	private Problem_3_maverickFinancialPlanner p3;
	
	@SuppressWarnings("unused")
	private static final Object[] parametersForProblem3ClassTest () {
		return $(
//				Parameters are: (1,2)
//								1=Number of Shares, 2=Portfolio Amount, 3=Closing Price
//				Test case 1
				$(50,	7009.50, 	140.00),
//				Test case 2
				$(299,	42375.11, 	140.00),
//				Test case 3
				$(750,	107100.00, 	140.00),
//				Test case 4
				$(999,	143356.50, 	140.00),
//				Test case 5
				$(2000,	287700.00, 	140.00),
//				Test case 6
				$(2001,	289944.90, 	140.00),
//				Test case 7
				$(10000,	1449000.00, 	140.00),
//				Test case 8
				$(1000,	143850.00, 	140.00),
//				Test case 9
				$(751,	107768.50, 	140.00),
//				Test case 10
				$(300,	42840.00, 	140.00),
//				Test case 11
				$(51,	7186.39, 	140.00),
//				Test case 12
				$(0,	-50.00, 	140.00)
		);
	}

	@Before
	public void setUp () {
		p3 = new Problem_3_maverickFinancialPlanner();
	}
	
	@Test
	@Parameters(method="parametersForProblem3ClassTest")
	public void test(int number_of_shares, double portfolio_amount, double closing_price) {
		
		
		p3.calculate_balance(number_of_shares, closing_price);
		
		assertEquals(portfolio_amount, p3.getPortfolio_amount(), 0.01);
	}

}

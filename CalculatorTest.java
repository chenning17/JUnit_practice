import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;

public class CalculatorTest {

	//the following tests written in order to make a calculator
	
	protected int x,y;
	
	@Before
	public void setUp() {
	x=5;
	y=8;
	}
	
	
	@After
	public void tearDown() {
	
	}
	
	
	
	
	@Test
	public void testAdd() {
		Calculator calc = new Calculator();
		int result = calc.add(x,y);
		//can add a string that is returned if test fails
		assertEquals("ADDITION METHOD INCORRECT", x+y,result);
	}
	
	@Test
	public void testSubtract() {
		Calculator calc = new Calculator();
		int result = calc.subtract(x,y);
		assertEquals(x-y,result);
	}
	
	@Test
	public void testMultiply() {
		Calculator calc = new Calculator();
		int result = calc.multiply(x,y);
		assertEquals(x*y,result);
	}
	
	@Test
	public void testDivide() {
		Calculator calc = new Calculator();
		int result = calc.divide(x,y);
		assertEquals(x/y,result);
	}

}

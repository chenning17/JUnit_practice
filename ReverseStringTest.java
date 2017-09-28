import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;


public class ReverseStringTest {

	protected String testString;
	protected String reversedTestString;
	
	@Before
	public void setUp() {
		testString = "abcdef";
		reversedTestString = "fedcba";
	}
	
	@After
	public void tearDown() {
		
	}
	
	
	@Test
	public void testReverse() {
		//ReverseString test = new ReverseString();
		String result = ReverseString.reverse(testString); 
		assertEquals(reversedTestString, result);
	}

}

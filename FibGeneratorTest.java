import static org.junit.Assert.*;
import org.junit.Before;

import org.junit.Test;

public class FibGeneratorTest {

	protected int[] fibValues = new int[10];
	
	 @Before  
	   public void setUp() { 
	     fibValues[0] = 0;
	     fibValues[1] = 1;
	     fibValues[2] = 1;
	     fibValues[3] = 2;
	     fibValues[4] = 3;
	     fibValues[5] = 5;
	     fibValues[6] = 8;
	     fibValues[7] = 13;
	     fibValues[8] = 21;
	     fibValues[9] = 34;
	   } 
	  
	
	@Test
	public void testGenerateFirst10Fibs() {
		FibGenerator f = new FibGenerator();
		
		int[] result = f.generateFibs(10);
		
		for(int i = 0; i<10; i++) {
		assertEquals(fibValues[i], result[i]);
		}
	}
	
	  //tearDown used to close the connection or clean up activities 
	   public void tearDown(  ) { 
	   } 

}

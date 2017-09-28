import static org.junit.Assert.*;

import org.junit.Test;

public class PrimesTest {

	protected int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23};  
	
		
	//test a few PRIME values to see if isPrime() method works correctly
	@Test
	public void testIsPrime13() {
		boolean result = Primes.isPrime(13);
		assertTrue(result);
		
	}
	
	
	
	@Test
	public void testIsPrime2() {
		boolean result = Primes.isPrime(2);
		assertTrue(result);
		
	}
	
	@Test
	public void testIsPrime3() {
		boolean result = Primes.isPrime(3);
		assertTrue(result);
		
	}
	
	
	@Test
	public void testIsPrime19() {
		boolean result = Primes.isPrime(19);
		assertTrue(result);
	}
	
	//test a few NON-PRIME values to check isPrime() method functions correctly
	@Test
	public void testIsPrime15() {
		boolean result = Primes.isPrime(15);
		assertFalse(result);
	}
	
	@Test
	public void testIsPrime1() {
		boolean result = Primes.isPrime(1);
		assertFalse(result);
		
	}
	
	@Test
	public void testIsPrime49() {
		boolean result = Primes.isPrime(49);
		assertFalse(result);
	}
	
	@Test
	public void testIsPrime33() {
		boolean result = Primes.isPrime(15);
		assertFalse(result);
	}
	
	
	//test prime generation method
	@Test
	public void testMakePrimes() {
		int[] result = Primes.makePrimes(9); //make lsit of first 9 primes.
		
		assertArrayEquals("Array generated is not equal to test case\n", primes, result);
	}

}

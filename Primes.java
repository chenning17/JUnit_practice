
public class Primes {

	public static boolean isPrime(int testValue) {
		
		if(testValue <= 1) {
			//only want to deal with positive integers  that are > 1, 1 is not prime
			return false;
		}
		
		
		
		boolean result = true; //true unless proven otherwise, also allows 2 to be a prime without specific treatment.
		
		int maxFactor = testValue/2; //use integer division to get largest whole number
		
		
		for(int i = 2; i<=maxFactor; i++) {
			if(testValue%i == 0) {
				//not a prime
				result = false;
				break;
			}
		}
		
		return result;
	}
	
	
	public static int[] makePrimes(int numberOfPrimes) {
		int[] primes = new int[numberOfPrimes];
		
				
		int i = 2; //first possible prime is 2 so start with this value.
		int count = 0;
		
		while(count < numberOfPrimes) {
			
			if(isPrime(i)) {
				primes[count] = i;
				count++;
			}
			i++;
		}
			
		return primes;
	}
	
	public static void main(String[] args) {
		
		
		int[] primes = makePrimes(20);
		
		for(int i =0; i< primes.length; i++) {
		System.out.printf("prime number %d is %d\n", i+1, primes[i]);
		}

	}

}

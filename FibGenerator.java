
public class FibGenerator {

	
	public int[] generateFibs(int n) {
		
		int[] values = new int[n];
		
		values[0] = 0;
		values[1] = 1;
		
		for(int i=2; i < n; i++) {
			
			values[i] = values[i-2] + values[i-1];
			
		}
		
		
		return values;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	}

}

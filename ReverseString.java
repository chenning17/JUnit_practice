
public class ReverseString {

	public static String reverse(String input) {
		
		String reversed = "";
		
		for(int i = input.length()-1; i>=0; i--) {
			reversed += input.charAt(i);
		}
		
		return reversed;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String toBeReversed = "star racecar kayak";
		
		System.out.printf("%s\n", reverse(toBeReversed));
		
		
	}

}

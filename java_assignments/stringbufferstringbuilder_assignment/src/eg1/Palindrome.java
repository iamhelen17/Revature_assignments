package eg1;

public class Palindrome {

	public static void main(String[] args) {
		// Print all the palindromes between 1000 and 9999
		
		System.out.println("Palindrome numbers between 1000 and 9999");
		for (int i = 1000; i < 9999; i++) {
			String str = Integer.toString(i);
			if (new StringBuffer(str).reverse().toString().equals(str)) {
				System.out.print(str + " ");
			}
		}

	}
}

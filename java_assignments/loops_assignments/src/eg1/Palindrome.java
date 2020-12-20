package eg1;

import java.util.Scanner;

public class Palindrome {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please type a word and hit Enter.");
		
		String word = sc.nextLine();
		
		sc.close();
		
		boolean b = isPalindrome(word);
		 
		if (b) {
			System.out.println(word + " is a palindrome");
		}
		else {
			System.out.println(word + " is not a palindrome");
		}
	}
	
	public static boolean isPalindrome(String str) {
		String s = str.toLowerCase();
		
		for (int i = 0; i < s.length()/2; i++) {
			if (s.charAt(i) != s.charAt(s.length() -1 -i)) {
				return false;
			}		
		}
		return true;
			
	}
}

package eg1;

public class RegularExpressions {

public static void main(String[] args) {
		
		//write a program to validate an SSN number using regex
		
		String ssn = "328-82-2265";
		if (ssn.matches("[0-9]{3}-[0-9]{2}-[0-9]{4}")) {
			System.out.println("This is a valid SSN number.");
		} else {
				System.out.println("Invalid SSN number!");
		}
		
		//write a program to validate DL (Arizona DL format)
		
		String dl = "D25793260";
		if (dl.matches("[D][0-9]{8}")) {
			System.out.println("\nThis is a valid DL number.");
		} else {
			System.out.println("Invalid DL number!");
		}

	}
}

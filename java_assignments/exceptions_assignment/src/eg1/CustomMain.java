package eg1;

public class CustomMain {

	public static void main(String[] args) {

		Validation v = new Validation();
		
		try {
			if (v.isValidDLNumber("D1246890")) {
				System.out.println("DL Number Validated");
			}
		} catch (InvalidDLException e) {
			System.out.println(e.getMessage());
		}
		
		try {
		if (v.isValidPassportNumber("AD098652")) {
			System.out.println("Passport Number Validated");
		}
		} catch (InvalidPassportException e) {
			System.out.println(e.getMessage());
		}
	}

}
//Create a Custom Checked exception if the entered DL is valid or not.
//Create a Custom Unchecked exception for checking if the entered Passport number is valid or not
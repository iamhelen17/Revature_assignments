package eg1;

public class Validation {

	public boolean isValidDLNumber (String dl) throws InvalidDLException {
		if (!dl.matches("[D][0-9]{8}")) {
			throw new InvalidDLException("Entered DL number " +dl+ " is INVALID.");
		}
		
		return true;
	}
	
	public boolean isValidPassportNumber (String pp) throws InvalidPassportException {
		if (!pp.matches("[A-Z]{2}[0-9]{6}")) {
			throw new InvalidPassportException("Entered Passport number " +pp+ " is INVALID");
		}
		
		return true;
	}
}

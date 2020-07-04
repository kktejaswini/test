package exceptionhandling;

public class userregistration {
	public void registerUser(String username, String userCountry) throws InvalidCountryException {
		if (!userCountry.equals("India"))
			throw new InvalidCountryException();
		else
			System.out.println("User registration done successfully");


	}

	public static void main(String[] args) {
		UserRegistration registration = new UserRegistration();

		try {
			registration.registerUser("Srimukhi", "India");
		} catch (InvalidCountryException e) {
		}
	}

}
class InvalidCountryException extends Exception {
	public InvalidCountryException() {
		super();
		System.out.println("InvalidCountryException occured");
		System.out.println("User Outside India  cannot be registered");
	}
} 

}

package exceptionhandling;

public class UserNotFoundException extends Exception
{

	/**
	 * Exception class if the user not existing in the data.
	 */
	private static final long serialVersionUID = 2009494142021287873L;
	// serialization is converting the data into 0's and 1's
	// deserialization is converting the data from 0's and 1's to readable format

	public UserNotFoundException(String message)
	{
		super(message);
	}

}

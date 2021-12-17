package introduceexception.after;

public class PasswordException extends IllegalArgumentException{
	
	public PasswordException(String message) {
		super(message);
	}
}

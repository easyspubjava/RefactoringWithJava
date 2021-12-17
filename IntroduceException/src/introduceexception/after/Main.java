package introduceexception.after;

public class Main {
	
	public static void main(String[] args) {

		Password test = new Password();
		String password = null;
		try {
			test.setPassword(password);
		} catch (PasswordException e) {
			System.out.println(e.getMessage());
		}
		
		password = "abcd";
		try {
			test.setPassword(password);
		} catch (PasswordException e) {
			System.out.println(e.getMessage());
		}
		
		password = "abcde";
		try {
			test.setPassword(password);
		} catch (PasswordException e) {
			System.out.println(e.getMessage());
		}
		
		password = "abcde#1";
		try {
			test.setPassword(password);
			System.out.println("���� ����");
		} catch (PasswordException e) {
			System.out.println(e.getMessage());
		}
	}
}

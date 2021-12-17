package introduceexception.after;

public class Password {

		private String password;
		
		public String getPassword(){
			return password;
		}
		
		public void setPassword(String password) throws PasswordException{
			
			if(password == null){
				throw new PasswordException("��й�ȣ�� null �� �� �����ϴ�");
			}
			else if( password.length() < 5){
				throw new PasswordException("��й�ȣ�� 5�� �̻��̾�� �մϴ�.");
			}
			else if (password.matches("[a-zA-Z]+")){
				throw new PasswordException("��й�ȣ�� ���ڳ� Ư�����ڸ� �����ؾ� �մϴ�.");
			}
			
			this.password = password;
		}
		
}

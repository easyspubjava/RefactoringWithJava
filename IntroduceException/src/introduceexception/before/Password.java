package introduceexception.before;

public class Password {

		private String password;
		
		public String getPassword(){
			return password;
		}
		
		public void setPassword(String password) {
			
			if(password == null){
				 System.out.println( "��й�ȣ�� null �� �� �����ϴ�");
			}
			else if( password.length() < 5){
				System.out.println( "��й�ȣ�� 5�� �̻��̾�� �մϴ�.");
			}
			else if (password.matches("[a-zA-Z]+")){
				System.out.println("��й�ȣ�� ���ڳ� Ư�����ڸ� �����ؾ� �մϴ�.");
			}
			else {
				System.out.println("���� ����");
			}
			
			this.password = password;
		}
		

}

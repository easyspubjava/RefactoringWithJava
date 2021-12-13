package typdecodewithsubclass.after;

public abstract class Customer {

	private String customerName;
	protected int bonusPoint;

	Customer( String customerName){
		this.customerName = customerName;
	}
	
	public abstract String getCustomerGrade();
	public abstract int calcPrice(int price);
	public abstract int calcBonusPoint(int price);
	
	public String getCustomerName() {
		return customerName;
	}
	
	public String toString() {
		return customerName + "���� ����� ����� " + getCustomerGrade() + "�Դϴ�.";
	}
}

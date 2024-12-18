package Lec39;

//           child class            parent class
public class PaymentMethod extends BankAccount {

	
	@Override
	 public boolean payment() {
		 return false;
	 }
	public static void main(String[] args) {
		 PaymentMethod pp = new  PaymentMethod();
	}
	
}

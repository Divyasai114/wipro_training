package Programs;

public class BankDetails {
	public static void main(String[] args) {
		BankAccount b = new BankAccount("Divya" ,15000);
		b.deposit(2000);
		b.withdraw(1000);
		b.displayDetails();
		
	}
}

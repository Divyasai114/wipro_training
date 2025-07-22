package Programs;

public class BankAccount {
	private String accountHolderName;
	private double balance;
	
	public BankAccount(String accountHolderName, double balance) {
		this.accountHolderName = accountHolderName;
		this.balance = balance;
	}
	public void deposit(double amount) {
		balance += amount;//balance = balance+ amount
		System.out.println("New balance is :"+balance);
	}
	public void withdraw(double amount) {
		if(amount > balance) {
			System.out.println("Insufficient balance.");
		}
		else {
			balance -= amount;
			System.out.println("withdrwan remainining balance :"+balance);
		}
	}
	public void displayDetails() {
		System.out.println("Account Holder Name :" +accountHolderName);
		System.out.println("current balance:"+balance);
	}
}


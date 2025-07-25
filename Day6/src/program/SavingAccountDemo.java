package program;

public class SavingAccountDemo {
	public static void main(String[] args) {
        // Create a SavingsAccount object
        SavingAccount savingAcc = new SavingAccount("SA12345", "John Doe", 5000.00);

        // Display initial account info
        savingAcc.display();

        // Perform deposit
        savingAcc.deposit(2000);

        // Perform withdrawal
        savingAcc.withdraw(1500);

        // Display updated account info
        savingAcc.display();
    }
}

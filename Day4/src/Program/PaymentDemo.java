package Program;

interface EcommercePayment {
    void makePayment();
}

abstract class PaymentSystem implements EcommercePayment {
    double amount;

    PaymentSystem(double amount) {
        this.amount = amount;
    }

    void showSuccessMessage() {
        System.out.println("Payment is successful: " + amount);
    }
}

// Debit Card Payment
class DebitCardPayment extends PaymentSystem {
    DebitCardPayment(double amount) {
        super(amount);
    }

    @Override
    public void makePayment() {
        System.out.println("Debit card payment of " + amount + " is done...");
        showSuccessMessage();
    }
}

// NetBanking Payment
class NetBankingPayment extends PaymentSystem {
    NetBankingPayment(double amount) {
        super(amount);
    }

    @Override
    public void makePayment() {
        System.out.println("Net-banking payment of " + amount + " is done...");
        showSuccessMessage();
    }
}

// Main class to demonstrate
public class PaymentDemo {
    public static void main(String[] args) {
        PaymentSystem payment1 = new DebitCardPayment(10000);
        payment1.makePayment();

        System.out.println();

        PaymentSystem payment2 = new NetBankingPayment(15000);
        payment2.makePayment();
    }
}


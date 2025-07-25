package program;

abstract class Realestate {
    int food;
    double rent;
    int expenses;
    double total;

    abstract void home();
    abstract void apartment();
}
class Divya extends Realestate {
    void home() {
        food = 10000;
        rent = 200000;
        expenses = 10000;
        total = food + rent + expenses;
        System.out.println("The total amount for home is Rs." + total);
    }

    void apartment() {
        food = 5000;
        rent = 80000;
        expenses = 3000;
        total = food + rent + expenses;
        System.out.println("The total amount for apartment is Rs." + total);
    }
}
public class Property {
    public static void main(String[] args) {
        Divya s = new Divya();
        s.home();
        s.apartment();
    }
}

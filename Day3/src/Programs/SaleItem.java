package Programs;

public class SaleItem {
    private String productName;
    private double price;
    private int quantity;

    // Constructor name corrected to match class name
    public SaleItem(String productName, double price, int quantity) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return price * quantity;
    }

    public void displayItem() {
        System.out.println(productName + "\t" + price + "\t" + quantity + "\t" + getTotalPrice());
    }
}

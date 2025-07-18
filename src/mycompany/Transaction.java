package mycompany;

public class Transaction {
    private String id;
    private String productId;
    private int quantity;
    private double totalAmount;

    public Transaction(String id, String productId, int quantity, double totalAmount) {
        this.id = id;
        this.productId = productId;
        this.quantity = quantity;
        this.totalAmount = totalAmount;
    }

    // Getter và Setter
    public String getId() {
        return id;
    }

    public String getProductId() {
        return productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    @Override
    public String toString() {
        return "Transaction{id='" + id + "', productId='" + productId + "', quantity=" + quantity + ", totalAmount=" + totalAmount + "}";
    }
}

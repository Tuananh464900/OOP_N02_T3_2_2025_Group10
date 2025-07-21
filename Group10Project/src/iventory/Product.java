
package iventory;

public class Product {
    private String productName;
    private int productId;
    private int quantity;
    private double price;

    // Constructor
    public Product(String productName, int productId, int quantity, double price) {
        this.productName = productName;
        this.productId = productId;
        this.quantity = quantity;
        this.price = price;
    }

    // Getter và Setter
    public String getProductName() {
        return productName;
    }

    public int getProductId() {
        return productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product [productId=" + productId + ", productName=" + productName + ", quantity=" + quantity + ", price=" + price + "]";
    }
}

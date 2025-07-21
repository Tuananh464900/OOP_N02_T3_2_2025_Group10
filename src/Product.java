package Group10Project.src;

public class Product {
    private String productID;
    private String name;
    private String category;
    private String unit;
    private int quantity;
    private double purchasePrice;
    private double salePrice;

    public Product(String productID, String name, String category, String unit, int quantity, double purchasePrice, double salePrice) {
        this.productID = productID;
        this.name = name;
        this.category = category;
        this.unit = unit;
        this.quantity = quantity;
        this.purchasePrice = purchasePrice;
        this.salePrice = salePrice;
    }

    public void updateStock(int change) {
        this.quantity += change;
    }

    public void displayInfo() {
        System.out.println("San pham: " + name +
                           " | Ma: " + productID +
                           " | Ton kho: " + quantity + " " + unit +
                           " | Gia ban: " + salePrice);
    }

    // Getter cho các trường cần thiết
    public int getQuantity() {
        return quantity;
    }

    public String getName() {
        return name;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public String getCategory() {
        return category;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }
}

// inventory/Inventory.java
package iventory;

import java.util.ArrayList;

public class Inventory {
    private ArrayList<Product> productList;

    public Inventory() {
        productList = new ArrayList<>();
    }

    // Thêm sản phẩm vào kho
    public void addProduct(Product product) {
        productList.add(product);
    }

    // Hiển thị danh sách kho hàng
    public void displayInventory() {
        for (Product product : productList) {
            System.out.println(product);
        }
    }

    // Cập nhật số lượng sản phẩm
    public void updateQuantity(int productId, int newQuantity) {
        for (Product product : productList) {
            if (product.getProductId() == productId) {
                product.setQuantity(newQuantity);
                return;
            }
        }
    }

    // Xóa sản phẩm khỏi kho
    public void removeProduct(int productId) {
        productList.removeIf(product -> product.getProductId() == productId);
    }
}

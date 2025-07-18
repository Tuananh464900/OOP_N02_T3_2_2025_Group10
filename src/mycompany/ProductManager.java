package mycompany;

import java.util.ArrayList;
import java.util.List;

public class ProductManager {
    private List<Product> products = new ArrayList<>();

    // Thêm sản phẩm
    public void addProduct(Product product) {
        products.add(product);
    }

    // Xóa sản phẩm
    public void deleteProduct(String id) {
        products.removeIf(product -> product.getId().equals(id));
    }

    // Cập nhật sản phẩm
    public void updateProduct(String id, String name, int quantity) {
        for (Product product : products) {
            if (product.getId().equals(id)) {
                product.setName(name);
                product.setQuantity(quantity);
                break;
            }
        }
    }

    // Hiển thị danh sách sản phẩm
    public void displayProducts() {
        if (products.isEmpty()) {
            System.out.println("No products available.");
        } else {
            for (Product product : products) {
                System.out.println(product);
            }
        }
    }
}

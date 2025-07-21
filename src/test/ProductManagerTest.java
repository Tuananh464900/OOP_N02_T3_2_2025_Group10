package test;

import mycompany.Product;
import mycompany.ProductManager;

import java.util.List;

public class ProductManagerTest {

    public static void main(String[] args) {
        // Tạo đối tượng ProductManager
        ProductManager manager = new ProductManager();

        // Kiểm thử phương thức thêm sản phẩm
        System.out.println("Kiểm thử thêm sản phẩm:");
        Product product1 = new Product("P001", "Điện thoại", 100);
        manager.addProduct(product1);
        // Kiểm tra danh sách sản phẩm sau khi thêm
        manager.displayProducts();

        // Kiểm thử phương thức cập nhật sản phẩm
        System.out.println("\nKiểm thử cập nhật sản phẩm:");
        manager.updateProduct("P001", "Điện thoại thông minh", 150);
        // Kiểm tra danh sách sản phẩm sau khi cập nhật
        manager.displayProducts();

        // Kiểm thử phương thức xóa sản phẩm
        System.out.println("\nKiểm thử xóa sản phẩm:");
        manager.deleteProduct("P001");
        // Kiểm tra danh sách sản phẩm sau khi xóa
        manager.displayProducts();

        
    }
}

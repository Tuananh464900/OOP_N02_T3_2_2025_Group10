package mycompany;

public class Main {
    public static void main(String[] args) {
        // Tạo đối tượng quản lý sản phẩm
        ProductManager manager = new ProductManager();

        // Thêm sản phẩm mới
        Product product1 = new Product("P001", "Điện thoại", 50);
        Product product2 = new Product("P002", "Laptop", 30);
        manager.addProduct(product1);
        manager.addProduct(product2);

        // Hiển thị danh sách sản phẩm
        manager.displayProducts();

        // Cập nhật sản phẩm
        manager.updateProduct("P001", "Điện thoại thông minh", 60);

        // Hiển thị lại danh sách sản phẩm
        manager.displayProducts();

        // Xóa sản phẩm
        manager.deleteProduct("P002");

        // Hiển thị danh sách sản phẩm sau khi xóa
        manager.displayProducts();
    }
}

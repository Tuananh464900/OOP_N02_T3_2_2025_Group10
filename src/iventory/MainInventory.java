// inventory/MainInventory.java
package iventory;

public class MainInventory {
    public static void main(String[] args) {
        // Tạo danh sách kho hàng
        Inventory inventory = new Inventory();

        // Thêm sản phẩm vào kho
        inventory.addProduct(new Product("Laptop", 1, 10, 1500.0));
        inventory.addProduct(new Product("Smartphone", 2, 50, 800.0));
        inventory.addProduct(new Product("Tablet", 3, 30, 600.0));

        System.out.println("Danh sách kho hàng:");
        inventory.displayInventory();

        // Cập nhật số lượng sản phẩm
        inventory.updateQuantity(2, 45);
        System.out.println("\nDanh sách kho sau khi cập nhật số lượng:");
        inventory.displayInventory();

        // Xóa sản phẩm khỏi kho
        inventory.removeProduct(1);
        System.out.println("\nDanh sách kho sau khi xóa sản phẩm:");
        inventory.displayInventory();
    }
}

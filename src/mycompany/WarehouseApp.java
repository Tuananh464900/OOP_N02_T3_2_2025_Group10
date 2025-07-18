package mycompany;

public class WarehouseApp {
    public static void main(String[] args) {
        // Tạo đối tượng quản lý CRUD
        ProductManager productManager = new ProductManager();
        PartnerManager partnerManager = new PartnerManager();
        TransactionManager transactionManager = new TransactionManager();

        // Thêm sản phẩm
        productManager.addProduct(new Product("P001", "Laptop", 10));
        productManager.addProduct(new Product("P002", "Phone", 20));

        // Thêm đối tác
        partnerManager.addPartner(new Partner("T001", "ABC Corp", "123-456"));

        // Tạo giao dịch
        transactionManager.createTransaction(new Transaction("Tr001", "P001", 2, 2000.0));

        // Hiển thị tất cả sản phẩm, đối tác và giao dịch
        System.out.println("Products:");
        productManager.displayProducts();

        System.out.println("\nPartners:");
        partnerManager.displayPartners();

        System.out.println("\nTransactions:");
        transactionManager.displayTransactions();

        // Cập nhật sản phẩm
        productManager.updateProduct("P001", "Gaming Laptop", 5);
        productManager.deleteProduct("P002");

        // Hiển thị lại sản phẩm sau khi cập nhật và xóa
        System.out.println("\nUpdated Products:");
        productManager.displayProducts();
    }
}

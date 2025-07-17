package Group10Project.src;

import java.time.LocalDate;

public class Transaction {
    private String transactionID;
    private LocalDate date;
    private String type; // IMPORT hoặc EXPORT
    private Product product;
    private int quantity;
    private Partner partner;

    public Transaction(String transactionID, String type, Product product, int quantity, Partner partner) {
        this.transactionID = transactionID;
        this.type = type;
        this.product = product;
        this.quantity = quantity;
        this.partner = partner;
        this.date = LocalDate.now();
    }

    public void process() {
        if (type.equalsIgnoreCase("IMPORT")) {
            product.updateStock(quantity);
        } else if (type.equalsIgnoreCase("EXPORT")) {
            if (quantity > product.getQuantity()) {
                System.out.println(" Lỗi: Không đủ hàng để xuất!");
                return;
            }
            product.updateStock(-quantity);
        }
        System.out.println(" Giao dich " + type + " thành công!");
    }

    public void printReceipt() {
        System.out.println("----- Phieu " + type + " -----");
        System.out.println("Ma giao dich: " + transactionID);
        System.out.println("Ngay: " + date);
        System.out.println("San pham: " + product.getName() + " | SL: " + quantity);
        System.out.println("Doi tac: " + partner.getName() + " (" + partner.getRole() + ")");
        System.out.println("-----------------------------\n");
    }
}

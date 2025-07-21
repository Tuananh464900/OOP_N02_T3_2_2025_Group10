package mycompany;

import java.util.ArrayList;
import java.util.List;

public class TransactionManager {
    private List<Transaction> transactions = new ArrayList<>();

    // Tạo giao dịch
    public void createTransaction(Transaction transaction) {
        try {
            if (transaction == null) {
                throw new IllegalArgumentException("Giao dịch không được null");
            }

            transactions.add(transaction);
            System.out.println(" Đã tạo giao dịch ID: " + transaction.getId());
        } catch (Exception e) {
            System.out.println(" Lỗi khi tạo giao dịch: " + e.getMessage());
        }
    }

    // Xóa giao dịch
    public void deleteTransaction(String id) {
        try {
            boolean removed = transactions.removeIf(transaction -> transaction.getId().equals(id));

            if (removed) {
                System.out.println(" Đã xóa giao dịch có ID: " + id);
            } else {
                System.out.println(" Không tìm thấy giao dịch có ID: " + id);
            }
        } catch (Exception e) {
            System.out.println(" Lỗi khi xóa giao dịch: " + e.getMessage());
        }
    }

    // Cập nhật giao dịch
    public void updateTransaction(String id, int quantity, double totalAmount) {
        try {
            boolean found = false;
            for (Transaction transaction : transactions) {
                if (transaction.getId().equals(id)) {
                    if (quantity < 0) {
                        throw new IllegalArgumentException("Số lượng không thể âm.");
                    }
                    transaction.setQuantity(quantity);
                    transaction.setTotalAmount(totalAmount);
                    found = true;
                    System.out.println(" Cập nhật thành công giao dịch ID: " + id);
                    break;
                }
            }

            if (!found) {
                System.out.println(" Không tìm thấy giao dịch có ID: " + id);
            }
        } catch (Exception e) {
            System.out.println(" Lỗi khi cập nhật giao dịch: " + e.getMessage());
        }
    }

    // Hiển thị danh sách giao dịch
    public void displayTransactions() {
        try {
            if (transactions.isEmpty()) {
                System.out.println(" Không có giao dịch nào.");
            } else {
                System.out.println(" Danh sách giao dịch:");
                for (Transaction transaction : transactions) {
                    System.out.println(transaction);
                }
            }
        } catch (Exception e) {
            System.out.println(" Lỗi khi hiển thị giao dịch: " + e.getMessage());
        }
    }
}

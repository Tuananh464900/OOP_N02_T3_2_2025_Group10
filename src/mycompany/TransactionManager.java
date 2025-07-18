package mycompany;

import java.util.ArrayList;
import java.util.List;

public class TransactionManager {
    private List<Transaction> transactions = new ArrayList<>();

    // Tạo giao dịch
    public void createTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

    // Xóa giao dịch
    public void deleteTransaction(String id) {
        transactions.removeIf(transaction -> transaction.getId().equals(id));
    }

    // Cập nhật giao dịch
    public void updateTransaction(String id, int quantity, double totalAmount) {
        for (Transaction transaction : transactions) {
            if (transaction.getId().equals(id)) {
                transaction.setQuantity(quantity);
                transaction.setTotalAmount(totalAmount);
                break;
            }
        }
    }

    // Hiển thị danh sách giao dịch
    public void displayTransactions() {
        if (transactions.isEmpty()) {
            System.out.println("No transactions available.");
        } else {
            for (Transaction transaction : transactions) {
                System.out.println(transaction);
            }
        }
    }
}

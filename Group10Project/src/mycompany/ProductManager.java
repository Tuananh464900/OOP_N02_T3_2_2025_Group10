package mycompany;

import java.util.ArrayList;
import java.util.List;

public class ProductManager {
    private List<Product> products = new ArrayList<>();

    // Thêm sản phẩm
    public void addProduct(Product product) {
        try {
            if (product == null) {
                throw new IllegalArgumentException("Sản phẩm không được null");
            }

            for (Product p : products) {
                if (p.getId().equals(product.getId())) {
                    throw new IllegalArgumentException("Sản phẩm có ID này đã tồn tại");
                }
            }

            products.add(product);
            System.out.println(" Đã thêm sản phẩm: " + product.getName());
        } catch (Exception e) {
            System.out.println(" Lỗi khi thêm sản phẩm: " + e.getMessage());
        }
    }

    // Xóa sản phẩm
    public void deleteProduct(String id) {
        try {
            boolean removed = products.removeIf(product -> product.getId().equals(id));

            if (removed) {
                System.out.println(" Đã xóa sản phẩm có ID: " + id);
            } else {
                System.out.println(" Không tìm thấy sản phẩm có ID: " + id);
            }
        } catch (Exception e) {
            System.out.println(" Lỗi khi xóa sản phẩm: " + e.getMessage());
        }
    }

    // Cập nhật sản phẩm
    public void updateProduct(String id, String name, int quantity) {
        try {
            boolean found = false;
            for (Product product : products) {
                if (product.getId().equals(id)) {
                    if (quantity < 0) {
                        throw new IllegalArgumentException("Số lượng không thể âm.");
                    }
                    product.setName(name);
                    product.setQuantity(quantity);
                    found = true;
                    System.out.println(" Cập nhật thành công sản phẩm ID: " + id);
                    break;
                }
            }
            if (!found) {
                System.out.println(" Không tìm thấy sản phẩm có ID: " + id);
            }
        } catch (Exception e) {
            System.out.println(" Lỗi khi cập nhật sản phẩm: " + e.getMessage());
        }
    }

    // Hiển thị danh sách sản phẩm
    public void displayProducts() {
        try {
            if (products.isEmpty()) {
                System.out.println(" Không có sản phẩm nào.");
            } else {
                System.out.println(" Danh sách sản phẩm:");
                for (Product product : products) {
                    System.out.println(product);
                }
            }
        } catch (Exception e) {
            System.out.println(" Lỗi khi hiển thị sản phẩm: " + e.getMessage());
        }
    }
}

package mycompany;

import java.util.ArrayList;
import java.util.List;

public class PartnerManager {
    private List<Partner> partners = new ArrayList<>();

    // Thêm đối tác
    public void addPartner(Partner partner) {
        try {
            if (partner == null) {
                throw new IllegalArgumentException("Đối tác không được null");
            }

            // Kiểm tra trùng ID
            for (Partner p : partners) {
                if (p.getId().equals(partner.getId())) {
                    throw new IllegalArgumentException("Đối tác có ID này đã tồn tại");
                }
            }

            partners.add(partner);
            System.out.println(" Đã thêm đối tác: " + partner.getName());
        } catch (Exception e) {
            // Xử lý lỗi khi thêm đối tác
            System.out.println(" Lỗi khi thêm đối tác: " + e.getMessage());
        }
    }

    // Xóa đối tác
    public void deletePartner(String id) {
        try {
            boolean removed = partners.removeIf(partner -> partner.getId().equals(id));

            if (removed) {
                System.out.println(" Đã xóa đối tác có ID: " + id);
            } else {
                System.out.println(" Không tìm thấy đối tác có ID: " + id);
            }
        } catch (Exception e) {
            // Xử lý lỗi khi xóa đối tác
            System.out.println(" Lỗi khi xóa đối tác: " + e.getMessage());
        }
    }

    // Cập nhật đối tác
    public void updatePartner(String id, String name, String contact) {
        try {
            boolean found = false;
            for (Partner partner : partners) {
                if (partner.getId().equals(id)) {
                    partner.setName(name);
                    partner.setContact(contact);
                    found = true;
                    System.out.println(" Cập nhật thành công đối tác ID: " + id);
                    break;
                }
            }

            if (!found) {
                System.out.println(" Không tìm thấy đối tác có ID: " + id);
            }
        } catch (Exception e) {
            // Xử lý lỗi khi cập nhật đối tác
            System.out.println(" Lỗi khi cập nhật đối tác: " + e.getMessage());
        }
    }

    // Hiển thị danh sách đối tác
    public void displayPartners() {
        try {
            if (partners.isEmpty()) {
                System.out.println(" Không có đối tác nào.");
            } else {
                System.out.println(" Danh sách đối tác:");
                for (Partner partner : partners) {
                    System.out.println(partner);
                }
            }
        } catch (Exception e) {
            // Xử lý lỗi khi hiển thị đối tác
            System.out.println(" Lỗi khi hiển thị đối tác: " + e.getMessage());
        }
    }
}

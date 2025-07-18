package mycompany;

import java.util.ArrayList;
import java.util.List;

public class PartnerManager {
    private List<Partner> partners = new ArrayList<>();

    // Thêm đối tác
    public void addPartner(Partner partner) {
        partners.add(partner);
    }

    // Xóa đối tác
    public void deletePartner(String id) {
        partners.removeIf(partner -> partner.getId().equals(id));
    }

    // Cập nhật đối tác
    public void updatePartner(String id, String name, String contact) {
        for (Partner partner : partners) {
            if (partner.getId().equals(id)) {
                partner.setName(name);
                partner.setContact(contact);
                break;
            }
        }
    }

    // Hiển thị danh sách đối tác
    public void displayPartners() {
        if (partners.isEmpty()) {
            System.out.println("No partners available.");
        } else {
            for (Partner partner : partners) {
                System.out.println(partner);
            }
        }
    }
}

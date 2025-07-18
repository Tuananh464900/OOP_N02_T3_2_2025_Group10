package Group10Project.src;

public class Partner {
    private String partnerID;
    private String name;
    private String role;
    private String contactInfo;

    public Partner(String partnerID, String name, String role, String contactInfo) {
        this.partnerID = partnerID;
        this.name = name;
        this.role = role;
        this.contactInfo = contactInfo;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public String getPartnerID() {
        return partnerID;
    }

    public String getContactInfo() {
        return contactInfo;
    }
}

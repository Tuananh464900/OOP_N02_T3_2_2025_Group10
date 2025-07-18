package mycompany;

public class Partner {
    private String id;
    private String name;
    private String contact;

    public Partner(String id, String name, String contact) {
        this.id = id;
        this.name = name;
        this.contact = contact;
    }

    // Getter và Setter
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getContact() {
        return contact;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "Partner{id='" + id + "', name='" + name + "', contact='" + contact + "'}";
    }
}

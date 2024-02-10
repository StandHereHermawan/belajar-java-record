package ariefbelajarteknologi.records.data;

public record Customer(String id, String name, String email, String phone) {

    public Customer(String id, String name, String email, String phone) {
        System.out.println("Customer Object Created");
        this.id = id.toLowerCase();
        this.name = name;
        this.email = email != null ? email.toLowerCase() : null;
        this.phone = phone != null ? phone.toLowerCase() : null;
    }

    public Customer(String id, String name, String email) {
        this(id, name, email, null);
    }

    public Customer(String id, String name) {
        this(id, name, null);
    }
}

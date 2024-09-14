public class Contact {
    private String name;
    private String phoneNumber;
    private String email;

    public Contact(String name, String phoneNumber, String email) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public String toString() {
        return "Nome: " + name + "\nTelefone: " + phoneNumber + "\nEmail: " + email;
    }

    public static void main(String[] args) {
        Contact exampleContact = new Contact("Maria Silva", "(11) 99999-1234", "maria.silva@example.com");

        System.out.println(exampleContact.toString());
    }
}
public class ContactlistTeste {
	public static void main(String[] args) {
        ContactList contactList = new ContactList();

        contactList.addContact(new Contact("Ana Costa", "(31) 99999-1111", "ana.costa@example.com"));
        contactList.addContact(new Contact("Carlos Mendes", "(21) 99999-2222", "carlos.mendes@example.com"));
        contactList.addContact(new Contact("Bruno Silva", "(11) 99999-3333", "bruno.silva@example.com"));

        contactList.listContacts();
        contactList.searchContact("Carlos Mendes");
        contactList.removeContact("Bruno Silva");
        contactList.listContacts();
    }
}


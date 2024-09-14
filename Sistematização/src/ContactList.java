public class ContactList {
    
    private Node head;

    public ContactList() {
        this.head = null;
    }

    public void addContact(Contact contact) {
        Node newNode = new Node(contact);  
        if (head == null) {  
            head = newNode;
        } else {  
            Node current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
        System.out.println("Contato adicionado: " + contact.getName());
    }

    public Contact searchContact(String nameOrPhone) {
        Node current = head;
        while (current != null) {
            Contact contact = current.getContact();
            if (contact.getName().equalsIgnoreCase(nameOrPhone) || contact.getPhoneNumber().equals(nameOrPhone)) {
                System.out.println("Contato encontrado: " + contact.toString());
                return contact;
            }
            current = current.getNext();
        }
        System.out.println("Contato não encontrado: " + nameOrPhone);
        return null;
    }

    public boolean removeContact(String nameOrPhone) {
        if (head == null) {
            System.out.println("Lista de contatos vazia.");
            return false;
        }

        if (head.getContact().getName().equalsIgnoreCase(nameOrPhone) || head.getContact().getPhoneNumber().equals(nameOrPhone)) {
            System.out.println("Contato removido: " + head.getContact().toString());
            head = head.getNext(); 
            return true;
        }

        
        Node current = head;
        while (current.getNext() != null) {
            if (current.getNext().getContact().getName().equalsIgnoreCase(nameOrPhone) || current.getNext().getContact().getPhoneNumber().equals(nameOrPhone)) {
                System.out.println("Contato removido: " + current.getNext().getContact().toString());
                current.setNext(current.getNext().getNext());  
                return true;
            }
            current = current.getNext();
        }

        System.out.println("Contato não encontrado para remoção: " + nameOrPhone);
        return false;
    }

    public void listContacts() {
        if (head == null) {
            System.out.println("Lista de contatos vazia.");
            return;
        }

        Node current = head;
        System.out.println("Lista de contatos:");
        while (current != null) {
            System.out.println(current.getContact().toString());
            current = current.getNext();
        } 
        
    }
}
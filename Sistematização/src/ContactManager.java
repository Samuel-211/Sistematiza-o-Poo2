import java.util.Scanner;

public class ContactManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContactList contactList = new ContactList();
        int option = 0;

        while (option != 5) {
            System.out.println("\n=== Menu de Gerenciamento de Contatos ===");
            System.out.println("1. Adicionar contato");
            System.out.println("2. Buscar contato");
            System.out.println("3. Remover contato");
            System.out.println("4. Listar todos os contatos");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");

            option = scanner.nextInt();
            scanner.nextLine();  
            
            switch (option) {
                case 1:
                    System.out.println("\nDigite o nome do contato:");
                    String name = scanner.nextLine();
                    System.out.println("Digite o telefone do contato:");
                    String phoneNumber = scanner.nextLine();
                    System.out.println("Digite o email do contato:");
                    String email = scanner.nextLine();

                    Contact newContact = new Contact(name, phoneNumber, email);
                    contactList.addContact(newContact);
                    break;

                case 2:
                    System.out.println("\nDigite o nome ou número de telefone do contato que deseja buscar:");
                    String searchTerm = scanner.nextLine();
                    contactList.searchContact(searchTerm);
                    break;

                case 3:
                    System.out.println("\nDigite o nome ou número de telefone do contato que deseja remover:");
                    String removeTerm = scanner.nextLine();
                    contactList.removeContact(removeTerm);
                    break;

                case 4:
                    contactList.listContacts();
                    break;

                case 5:
                    System.out.println("Saindo do sistema. Até logo!");
                    break;

                default:
                    System.out.println("Opção inválida! Por favor, escolha uma opção válida.");
                    break;
            }
        }

        scanner.close();
    }
}
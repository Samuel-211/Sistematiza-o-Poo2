public class NodeTeste {
   public static void main(String[] args) {  
        Contact contact1 = new Contact("João Pereira", "(21) 98888-4321", "joao.pereira@example.com");    
        Node node1 = new Node(contact1);

        System.out.println(node1.getContact().toString());
    }
}

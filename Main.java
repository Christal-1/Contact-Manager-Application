import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContactManager contactManager = new ContactManager();
        boolean running = true;

        while (running) {
            System.out.println("\nContact Manager Menu:");
            System.out.println("1. Add Contact");
            System.out.println("2. View Contacts");
            System.out.println("3. Update Contact");
            System.out.println("4. Delete Contact");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter phone number: ");
                    String phoneNumber = scanner.nextLine();
                    System.out.print("Enter email address: ");
                    String email = scanner.nextLine();
                    contactManager.addContact(name, phoneNumber, email);
                    break;
                case 2:
                    contactManager.viewContacts();
                    break;
                case 3:
                    contactManager.viewContacts();
                    System.out.print("Enter contact index to update: ");
                    int updateIndex = scanner.nextInt();
                    scanner.nextLine();  // Consume newline
                    System.out.print("Enter new name: ");
                    String newName = scanner.nextLine();
                    System.out.print("Enter new phone number: ");
                    String newPhoneNumber = scanner.nextLine();
                    System.out.print("Enter new email address: ");
                    String newEmail = scanner.nextLine();
                    contactManager.updateContact(updateIndex, newName, newPhoneNumber, newEmail);
                    break;
                case 4:
                    contactManager.viewContacts();
                    System.out.print("Enter contact index to delete: ");
                    int deleteIndex = scanner.nextInt();
                    contactManager.deleteContact(deleteIndex);
                    break;
                case 5:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }

        scanner.close();
    }
}

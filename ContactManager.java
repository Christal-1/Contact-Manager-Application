import java.util.ArrayList;
import java.util.List;

public class ContactManager {
    private List<Contact> contacts;

    public ContactManager() {
        contacts = new ArrayList<>();
    }

    public void addContact(String name, String phoneNumber, String email) {
        contacts.add(new Contact(name, phoneNumber, email));
    }

    public void updateContact(int index, String name, String phoneNumber, String email) {
        if (index >= 0 && index < contacts.size()) {
            Contact contact = contacts.get(index);
            contact.setName(name);
            contact.setPhoneNumber(phoneNumber);
            contact.setEmail(email);
        }
    }

    public void deleteContact(int index) {
        if (index >= 0 && index < contacts.size()) {
            contacts.remove(index);
        }
    }

    public void viewContacts() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts available.");
            return;
        }
        for (int i = 0; i < contacts.size(); i++) {
            System.out.println(i + ": " + contacts.get(i));
        }
    }
}

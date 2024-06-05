import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ContactBook {
    private Map<String, Contact> contacts;

    public ContactBook() {
        this.contacts = new HashMap<>();
    }

    public void addContact(String name, String phoneNumber, String email) {
        Contact contact = new Contact(name, phoneNumber, email);
        contacts.put(name, contact);
    }

    public void updateContact(String name, String phoneNumber, String email) {
        if (contacts.containsKey(name)) {
            Contact contact = contacts.get(name);
            contact.setPhoneNumber(phoneNumber);
            contact.setEmail(email);
            contacts.put(name, contact);
            System.out.println("Contact updated successfully.");
        } else {
            System.out.println("Contact not found.");
        }
    }

    public void deleteContact(String name) {
        if (contacts.containsKey(name)) {
            contacts.remove(name);
            System.out.println("Contact deleted successfully.");
        } else {
            System.out.println("Contact not found.");
        }
    }

    public Contact searchContact(String name) {
        if (contacts.containsKey(name)) {
            return contacts.get(name);
        } else {
            System.out.println("Contact not found.");
            return null;
        }
    }

    public void displayAllContacts() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts found.");
        } else {
            System.out.println("All contacts:");
            for (Contact contact : contacts.values()) {
                System.out.println(contact);
            }
        }
    }

    public static void main(String[] args) {
        ContactBook contactBook = new ContactBook();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. Add Contact");
            System.out.println("2. Update Contact");
            System.out.println("3. Delete Contact");
            System.out.println("4. Search Contact");
            System.out.println("5. Display All Contacts");
            System.out.println("6. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.println("Enter name:");
                    String name = scanner.nextLine();
                    System.out.println("Enter phone number:");
                    String phoneNumber = scanner.nextLine();
                    System.out.println("Enter email:");
                    String email = scanner.nextLine();
                    contactBook.addContact(name, phoneNumber, email);
                    break;
                case 2:
                    System.out.println("Enter name of contact to update:");
                    String updateName = scanner.nextLine();
                    System.out.println("Enter new phone number:");
                    String newPhoneNumber = scanner.nextLine();
                    System.out.println("Enter new email:");
                    String newEmail = scanner.nextLine();
                    contactBook.updateContact(updateName, newPhoneNumber, newEmail);
                    break;
                case 3:
                    System.out.println("Enter name of contact to delete:");
                    String deleteName = scanner.nextLine();
                    contactBook.deleteContact(deleteName);
                    break;
                case 4:
                    System.out.println("Enter name of contact to search:");
                    String searchName = scanner.nextLine();
                    Contact result = contactBook.searchContact(searchName);
                    if (result != null) {
                        System.out.println("Contact details:");
                        System.out.println(result);
                    }
                    break;
                case 5:
                    contactBook.displayAllContacts();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

class Contact {
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

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Phone Number: " + phoneNumber + ", Email: " + email;
    }
}
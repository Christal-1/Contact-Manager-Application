Contact Manager
Description

A simple Java console application to manage contact information. Users can add, view, update, and delete contacts. Each contact includes a name, phone number, and email address.
Features

    Add Contact: Input name, phone number, and email address to create a new contact.
    View Contacts: Display all stored contacts with details on separate lines.
    Update Contact: Modify the details of an existing contact.
    Delete Contact: Remove a contact from the list.

Requirements

    Java Development Kit (JDK) 8 or higher

Getting Started

    Clone the repository:

    sh

git clone https://github.com/Christal-1/Contact-Manager-Application
cd contact-manager

Compile the Java files:

sh

javac Contact.java ContactManager.java Main.java

Run the application:

sh

    java Main

Usage

Upon running the application, you will see a menu with the following options:

    Add Contact: Enter details for a new contact.
    View Contacts: List all contacts with their details formatted on separate lines.
    Update Contact: Enter the index of the contact you want to update and provide new details.
    Delete Contact: Enter the index of the contact you want to delete.
    Exit: Close the application.

Example

sql

Contact Manager Menu:
1. Add Contact
2. View Contacts
3. Update Contact
4. Delete Contact
5. Exit
   Choose an option: 1
   Enter name: John Doe
   Enter phone number: 123-456-7890
   Enter email address: john.doe@example.com

Contact Manager Menu:
1. Add Contact
2. View Contacts
3. Update Contact
4. Delete Contact
5. Exit
   Choose an option: 2
   0:
   Name: John Doe
   Phone: 123-456-7890
   Email: john.doe@example.com

Contact Manager Menu:
1. Add Contact
2. View Contacts
3. Update Contact
4. Delete Contact
5. Exit
   Choose an option: 3
   Enter contact index to update: 0
   Enter new name: Jane Doe
   Enter new phone number: 098-765-4321
   Enter new email address: jane.doe@example.com

Contact Manager Menu:
1. Add Contact
2. View Contacts
3. Update Contact
4. Delete Contact
5. Exit
   Choose an option: 2
   0:
   Name: Jane Doe
   Phone: 098-765-4321
   Email: jane.doe@example.com

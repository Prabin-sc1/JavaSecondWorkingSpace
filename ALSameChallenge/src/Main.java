/*
 * Name:Prabin kumar Shah
 * Roll No.:181728
 * Program:BESE
 * Shift:Day
 */
import java.util.Scanner;

public class Main {
	private static Scanner s = new Scanner(System.in);
	private static MobilePhone phone = new MobilePhone();

	public static void main(String[] args) {

		boolean quit = false;
		printInstructions();
		int choice = 0;
		while (!quit) {
			System.out.println("Enter your choice:");
			choice = s.nextInt();
			s.nextLine();

			switch (choice) {
			case 1:
				printInstructions();
				break;
			case 2:
				addNewContact();
				break;
			case 3:
				phone.print();
				break;
			case 4:
				modifyContact();
				break;
			case 5:
				removeContact();
				break;
			case 6:
				searchContact();
				break;
			case 7:
				System.out.println("Shutting down...");
				quit = true;
				break;
			default:
				System.out.println("Wrong choice");
			}
		}

	}

	public static void printInstructions() {
		System.out.println("Enter:\n" + "\t 1.to print choice option\n" + "\t 2.to add new contact\n"
				+ "\t 3.to print contact\n" + "\t 4.to modify contact\n" + "\t 5.to remove contact\n"
				+ "\t 6.to search contact\n" + "\t 7.to quit");
	}

	private static void addNewContact() {
		System.out.println("Enter new contact name:");
		String name = s.nextLine();
		System.out.println("Enter contact number:");
		String number = s.nextLine();
		// phone.addContact(new Contacts(name,number));
		Contact newContact = Contact.createContact(name, number);
		// phone.addContact(newContact);

		// phone.addContact(Contacts.createContact(name, number));// here we don't need
		// create instance .calling static method createContact
		if (phone.addNewContact(newContact)) {
			System.out.println("New contact added:\nName: " + name + "\nContact Number: " + number);
		}
		// else {
//			System.out.println("Cannot add "+name+" already in contact list");
//		}
	}
//	public static void addNewContact() {
//		System.out.println("Enter new contact name:");
//		String name = s.nextLine();
//		System.out.println("Enter new phone number:");
//		String phone = s.nextLine();
//		Contact newContact = Contact.createContact(name, phone);
//		// Contact newContact=new Contact(name,phone);
//		if (phone.addNewContact(newContact)) {
//			System.out.println("New contact added: " + name + ", phone=" + phone);
//		} //else {
//			//System.out.println("Cannot added, " + name + "already on file");
//		//}
//	}

	public static void modifyContact() {
		System.out.println("Enter the contact name that you wanna modify:");
		String name = s.nextLine();
		Contact existingContactRecord = phone.searchContact(name);
		if (existingContactRecord == null) {
			System.out.println("Contact not found.");
			return;
		}
		System.out.println("Enter new name:");
		String newName = s.nextLine();
		System.out.println("Enter new contact number:");
		String newNumber = s.nextLine();
		Contact newContact = Contact.createContact(newName, newNumber);
		if (phone.update(existingContactRecord, newContact)) {
			System.out.println("Successfully updated record.");
		} else {
			System.out.println("Error while updating record");
		}
	}

	public static void removeContact() {
		System.out.println("Enter the contact name that you wanna remove:");
		String name = s.nextLine();
		Contact oldContact = phone.searchContact(name);
		if (oldContact == null) {
			System.out.println("Contact not found.");
			return;
		}
		if (phone.remove(oldContact)) {
			System.out.println("Deleted succesfully");
		} else {
			System.out.println("Error while deleting");
		}
	}

	public static void searchContact() {
		System.out.println("Enter contact name that you wanna search:");
		String name = s.nextLine();
		Contact oldContact = phone.searchContact(name);
		if (oldContact == null) {
			System.out.println("Contact not found");
		} else {
			System.out.println("Contact Found");
			System.out.println("Name:" + oldContact.getName() + ", Phone:" + oldContact.getPhoneNumber());
		}
	}



}

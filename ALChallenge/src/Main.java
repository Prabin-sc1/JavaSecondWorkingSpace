import java.util.Scanner;

public class Main {
	private static Scanner s = new Scanner(System.in);
	private static MobilePhone phone = new MobilePhone("9803713609");

	public static void main(String[] args) {
		boolean quit=false;
		startPhone();
		printActions();
		int choice=0;
		while(!quit) {
			System.out.println("Enter your choice:");
			choice=s.nextInt();
			s.nextLine();
			switch(choice) {
			case 0:
				quit=true;
				break;
			case 1:
				phone.printAllContact();
				break;
			case 2:
				addNewContact();
				break;
			case 3:
			    updateContact();
				break;
			case 4:
				removeContact();
				break;
			case 5:
				searchContact();
				break;
			case 6:
				printActions();
				break;
				
				default:
					System.out.println("Wrong choice!!!");
			}
		}
	}
		private static void startPhone() {
			System.out.println("Welcome...");
			
		}
		private static void printActions() {
			System.out.println("\nAvailable actions:\nEnter:");
			System.out.println("\t 0.to shutdown\n"+"\t 1.to print Contacts\n"+"\t 2.to add a new contact\n"+"\t 3.to update existing contact\n"+
			"\t 4.to remove existing contact\n"+"\t 5.search if that contact on your contact list\n"+"\t 6.to print a list of available actions");
			//System.out.println("Enter your choice:");
		}
		private static void addNewContact() {
			System.out.println("Enter new contact name:");
			String name=s.nextLine();
			System.out.println("Enter new contact number:");
			String number=s.nextLine();
		//	phone.addContact(new Contacts(name,number));
		Contacts newContact=Contacts.createContact(name, number);
		//phone.addContact(newContact);
			
		//phone.addContact(Contacts.createContact(name, number));// here we don't need create instance .calling static method createContact
			if(phone.addContact(newContact)) {
				System.out.println("New contact added: name= "+name+", phone ="+number);
		}
			//else {
//				System.out.println("Cannot add "+name+" already in contact list");
//			}
		}
		private static void updateContact() {
			System.out.println("Enter existing contact name:");
			String oldContactName=s.nextLine();
			
			Contacts existingContactRecord=phone.queryContact(oldContactName);
			
			if(existingContactRecord==null) {
				System.out.println("Contact not found in contact list.");
				return ;
			}
			
			System.out.println("Enter another name:");
			String name=s.nextLine();
			System.out.println("Enter another phone number:");
			String phoneNumber=s.nextLine();
			if(phone.updateContact(existingContactRecord, Contacts.createContact(name, phoneNumber))) {
				System.out.println("Successfully updated record.");
			}else {
				System.out.println("Error while updating record.");
			}
		}
		
		public static void removeContact() {
			System.out.println("Enter the name of contact that you wanna remove.");
			String name=s.nextLine();
			Contacts searchContact=phone.queryContact(name);
			
			if(searchContact==null) {
				System.out.println("Contact name was not found in contact list.");
				return;
			}
			if(phone.removeContact(searchContact)) {
				System.out.println("Successfully removed from contact list.");
			}
			else {
				System.out.println("Erroe while removing contact.");
			}
		
		}
		public static void  searchContact() {
			System.out.println("Enter the contact name that you are searching for:");
			String name=s.nextLine();
			
			Contacts searchContact=phone.queryContact(name);
			if(searchContact==null) {
				System.out.println("Contact name not found in contact list.");
				return;
			}
			System.out.println("Found,");
			System.out.println("Name: "+searchContact.getName()+ " & Phone number: "+searchContact.getPhoneNumber());
			
		}
		
		

		
	}



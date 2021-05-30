import java.util.Scanner;

public class Main {
	private static Scanner s = new Scanner(System.in);
	private static MobilePhone phone = new MobilePhone();

	public static void main(String[] args) {
		boolean quit = false;
		int choice = 0;
		printChoiceOption();
		while (!quit) {
			System.out.println("Enter your choice:");
			choice = s.nextInt();
			// s.nextLine();
			switch (choice) {
			case 1:
				printChoiceOption();
				break;
			case 2:
				phone.printList();
				break;
			case 3:
				addContact();
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
				quit=true;
				break;
			default:
				System.out.println("Wrong choice!!!");

			}
		}

	}
	public static void printChoiceOption() {
	System.out.println("Enter:\n"+"\t 1.To print choice option\n"+"\t 2.To print contact list\n"+
	"\t 3.To add contact\n"+"\t 4.To modify contact\n"+"\t 5.To remove contact\n"+
			"\t 6.To search contact\n"+"\t 7.Quit");	
	}
	public static void addContact() {
		phone.add(contact);
	}
public static void modifyContact() {
	
}
public static void removeContact() {

}
public static void searchContact() {
	
}
}

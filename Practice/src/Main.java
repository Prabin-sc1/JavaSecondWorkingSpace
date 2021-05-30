import java.util.Scanner;

public class Main {
	private static Scanner s = new Scanner(System.in);
	private static GmailList list = new GmailList();

	public static void main(String[] args) {
		int choice = 0;
		printInstructions();
		boolean quit = false;
		while (!quit) {
			System.out.println("Enter your choice:");
			choice = s.nextInt();
			s.nextLine();
			switch (choice) {
			case 0:
				printInstructions();
				break;
			case 1:
				addEmail();
				break;
			case 2:
				list.print();
				break;
			case 3:
				modifyEmail();
				break;
			case 4:
				removeEmail();
				break;
			case 5:
				searchEmail();
				break;
			case 6:
				quit = false;
				break;
			}
		}
	}

	public static void printInstructions() {
		System.out.println("Enter:\n" +
							"\t 0.to printInstructions\n"
							+ "\t 1.to add email\n" +
							"\t 2.to print List\n"+"\t 3.to modify email\n"+"\t 4.to remove email\n"+"\t 5.to search email\n"+
							 "\t 6.to quit");
	}

	public static void addEmail() {
		System.out.println("Enter name:");
		String name = s.nextLine();
		System.out.println("Enter email");
		String email = s.nextLine();
		Email newEmail=Email.createEmail(name, email);
		if(list.add(newEmail)) {
			System.out.println("New email added");
		}else {
			System.out.println("cannot added ,already on file");
		}
	}
	public static void modifyEmail() {
		System.out.println("enter email that you wanna modify");
		String email=s.nextLine();
	       Email existingEmail=list.queryGmail(email);
	       if(existingEmail==null) {
	    	   System.out.println("Email not found");
	       }
	       System.out.println("Enter new name");
	       String newName=s.nextLine();
	       System.out.println("Enter new email");
	       String newEmail=s.nextLine();
	       Email anotherEmail=Email.createEmail(newName, newEmail);
	       if(list.modify(existingEmail, anotherEmail)) {
	    	   System.out.println(existingEmail.getEmail()+" was modified with "+anotherEmail.getEmail());
	       }
	       else {
	    	   System.out.println("Error while updating email");
	       }
	}
	public static void removeEmail() {
		System.out.println("enter email that you wanna remove");
		String email=s.nextLine();
	       Email existingEmail=list.queryGmail(email);
	       if(existingEmail==null) {
	    	   System.out.println("Email not found");
	       }
	       if(list.remove(existingEmail)) {
	    	   System.out.println("email  was deleted.");
	       }
	       else {
	    	   System.out.println("Error while updating email:");
	       }
	}
	public static void searchEmail() {
		System.out.println("Enter email that you wanna search:");
		String email=s.nextLine();
		Email existingEmail=list.queryGmail(email);
		if(existingEmail==null) {
			System.out.println("email  was not found.");
		}
		else {
			System.out.println("Found:");
			System.out.println("Name:"+existingEmail.getName()+"  Email:"+existingEmail.getEmail());
		}
	}
	
	
	
	
	
	
}
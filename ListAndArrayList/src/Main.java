import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	private static Scanner s = new Scanner(System.in);
	private static GroceryList groceryList = new GroceryList();

	public static void main(String[] args) {
		boolean quit = false;
		int choice = 0;
		printInstructions();
		while (!quit) {
			System.out.println("Enter your choice:");
			choice = s.nextInt();
			s.nextLine();

			switch (choice) {
			case 0:
				printInstructions();
				break;
			case 1:
				groceryList.printItem();
				break;
			case 2:
				addItem();
				break;
			case 3:
				modifyItem();
				break;
			case 4:
				removeItem();
				break;
			case 5:
				queryItem();
				break;
			case 6:
				quit = true;
				break;
			}

		}
	}

	public static void printInstructions() {
		System.out.println("Enter:\n"+
	"\t 0.To print choice option.\n"+
				"\t 1.To print the grocery list item\n"+
	"\t 2.To add an item to list.\n"+
				"\t 3.To modify an item in the list\n"+
	"\t 4.To remove an item from the lsit\n"+
				"\t 5.To search an item\n"+""
						+ "\t 6.To quit application");
	}
	
	public static void addItem() {
		System.out.println("Please enter the item for grocery List:");
		groceryList.addItem(s.nextLine());
		
	}
	public static void modifyItem() {
		System.out.println("Enter the name of item that you wanna modify");
		String itemName=s.nextLine();
		System.out.println("So,please enter another item name:");
			String newItem=s.nextLine();
		groceryList.modifyItem(itemName, newItem);
		
		
	}
	public static void removeItem() {
		System.out.println("Enter the name of item that you wanna remove");
		String itemName=s.nextLine();
			//String newItem=s.nextLine();
		groceryList.removeItem(itemName);
		
	}
	public static void queryItem() {
		System.out.println("Enter the item that you wanna search:");
		String searchItem=s.nextLine();
		if(groceryList.onFile(searchItem)) {
			System.out.println("Found "+searchItem+" in list.");
			
		}else {
			System.out.println(searchItem+" is not in the list");
		}
	}
	public static void copyArrayList() {
		ArrayList<String> copingToThisArrayList=new ArrayList<>(groceryList.getGroceryList());
		String[] normalArray=new String[groceryList.getGroceryList().size()];
		normalArray=groceryList.getGroceryList().toArray(normalArray);
	}

}

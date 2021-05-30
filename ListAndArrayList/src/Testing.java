import java.util.ArrayList;
import java.util.Scanner;

public class Testing {
	private static Scanner s = new Scanner(System.in);
	private static FriendList mateList = new FriendList();

	public static void main(String[] args) {
		boolean quit=false;
		int choice=0;
		printChoiceOption();
		while(!quit) {
			System.out.println("Enter your choice:");
			choice=s.nextInt();
			s.nextLine();
			switch(choice) {
			case 1:
				printChoiceOption();
				break;
			case 2:
				mateList.print();
				break;
			case 3:
				add();
				break;
			case 4:
				modify();
				break;
			case 5:
				remove();
				break;
			case 6:
				search();
				break;
			case 7:
				processArrayList();
				break;
			case 8:
				quit=true;
				break;
			default:
				System.out.println("Hey,mate you have chosen wrong option.");


			}
		}
	}
	public static void printChoiceOption() {
		System.out.println("Enter: \n" + "\t 1.To print choice option\n" + "\t 2.To print friend list\n"
				+ "\t 3.To add friend\n" + "\t 4.To modify friend list.\n" + "\t 5.To remove friend.\n"
				+ "\t 6.To search friend.\n"+"\t 7.To process array list\n" + "\t 8.Quit\n");
	}
	public static void add() {
		System.out.println("Enter the name that you wanna add in your friend list.");
		mateList.add(s.nextLine());
	}
	public static void modify() {
		System.out.println("Enter the name of friend that you wanna modify:");
		String pos=s.nextLine();
		//s.nextLine();
		System.out.println("Enter another name:");
		String anotherName=s.nextLine();
		mateList.modify(pos, anotherName);
		
	}
	public static void remove() {
		System.out.println("Enter the name of friend that you wanna remove:");
		String pos=s.nextLine();
		mateList.remove(pos);
		//System.out.println(pos+" was removed from list.");
	}
	public static void search() {
		System.out.println("Enter the name of friend that you wanna search in your list:");
		String name=s.nextLine();
		if(mateList.find(name)) {
			System.out.println("Found "+name+" in friend's list.");
		}else {
	      System.out.println("Not Found "+name+" in friend's list.");
		}
	}
	public static void processArrayList() {
		//ArrayList<String> newArray=new ArrayList<String>();
		//newArray.addAll(mateList.getFriendList());
		
		ArrayList<String> nextArray=new ArrayList<String>(mateList.getFriendList());
	   System.out.println(nextArray.toString());
		String[] myArray=new String[mateList.getFriendList().size()];
		myArray=mateList.getFriendList().toArray(myArray);
	}
	

}

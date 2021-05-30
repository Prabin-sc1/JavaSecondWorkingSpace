import java.util.ArrayList;
import java.util.Scanner;

public class Test {
	private static Scanner s=new Scanner(System.in);
    private static WatchedSeriesList list=new  WatchedSeriesList();
    
	public static void main(String[] args) {
		boolean quit=false;
		int choice=0;
		printInstructions();
		
		while(!quit) {
			
			System.out.println("Enter your choice");
			choice=s.nextInt();
			s.nextLine();
			switch(choice) {
			case 1:
				printInstructions();
				break;
			case 2:
				list.printList();
				break;
			case 3:
				addSeries();
				break;
			case 4:
				modifySeries();
				break;
			case 5:
				removeSeries();
				break;
			case 6:
				searchSeries();
				break;
			case 7:
				quit=true;
				 break;
			default:
				System.out.println("Invalid choice");
			}
		}

	}
	public static void printInstructions() {
		System.out.println("Enter:\n"+"\t 1.To print choice option\n"+
	"\t 2.To print series in your watched list\n"+"\t 3.To add series in your series List\n"+"\t 4.To modify your watched list\n"
				+"\t 5.To remove series from your watched\n"+"\t 6.To search a series in your watched list\n"+"\t 7.Quit");
	}
	public static void addSeries(){
		System.out.println("Enter the name of series that you "
				+ "wanna add . ");
		list.add(s.nextLine());
	}
	public static void modifySeries() {
		System.out.println("Enter the name of series that you "
				+ "wanna modify.");
		String pos=s.nextLine();
		//s.nextLine();
		String newSeries=s.nextLine();
		list.modify(pos, newSeries);
		
	}
	public static void removeSeries() {
		System.out.println("Enter the name of series that you wanna remove from watched list.");
		String pos=s.nextLine();
		list.remove(pos);
	}
	public static void searchSeries() {
		System.out.println("Enter the name of your series that you wanna search.");
		String searchSeries=s.nextLine();
		if(list.find(searchSeries)) {
			System.out.println("Found "+searchSeries+" in your watched list");
		}
		else {
			System.out.println(searchSeries+",you haven't watched yet.");
		}
	}
	public static void copyArrayListIntoAnotherArray() {
		ArrayList<String> newArrayList=new ArrayList<>(list.getList());//this one line of code can copy arrayList into another arrayList
		
		String[] normalArray=new String[list.getList().size()];
		normalArray=list.getList().toArray(normalArray);
				
	}
}

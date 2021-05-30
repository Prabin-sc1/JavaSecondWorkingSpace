import java.util.ArrayList;
import java.util.Scanner;

public class Check {
	private static Scanner s = new Scanner(System.in);
	private static AudioList list = new AudioList();

	public static void main(String[] args) {
		boolean quit = false;
		int choice = 0;
		printInstructions();
		while (!quit) {
			System.out.println("Enter your choice:");
			choice = s.nextInt();
			s.nextLine();
			switch (choice) {
			case 1:
				printInstructions();
				break;
			case 2:
				list.printList();
				break;
			case 3:
				addAudio();
				break;
			case 4:
				modifyAudio();
				break;
			case 5:
				removeAudio();
				break;
			case 6:
				searchAudio();
				break;
			case 7:
				quit = true;
				break;
			default:
				System.out.println("Hey,buddy you have pressed the number that wasn't " + "in the choice option.");

			}
		}

	}

	public static void printInstructions() {
		System.out.println("Enter: \n" + "\t 1.To print instructions\n" + "\t 2.To print audio list\n"
				+ "\t 3.To add audio\n" + "\t 4.To modify audio title.\n" + "\t 5.To remove audio.\n"
				+ "\t 6.To search audio.\n" + "\t 7.Quit\n");
	}

	public static void addAudio() {
		System.out.println("Enter the title of audio that you wanna add.");
		list.add(s.nextLine());
	}

	public static void modifyAudio() {
		System.out.println("Enter the title of audio that you wanna modify");
		String title = s.nextLine();
	//	s.nextLine();
		System.out.println("Please enter another audio");
		String newAudio = s.nextLine();
		list.modify(title, newAudio);
		System.out.println(title+" was modified .");
	}

	public static void removeAudio() {
		System.out.println("Enter the title of audio that you wanna remove.");
		String title = s.nextLine();
		list.remove(title);
		System.out.println(title+" was removed from list.");
	}

	public static void searchAudio() {
		System.out.println("Please enter the name of audio that you wanna search.");
		String searchingAudio = s.nextLine();
		if (list.find(searchingAudio)) {
			System.out.println("Found " + searchingAudio + " in audio list.");
		} else {
			System.out.println("Not found " + searchingAudio + " in audio list.");
		}
	}
	public static void processArrayList() {
		ArrayList<String> myArray=new ArrayList<String>(list.getAudioList());
		
	}

}

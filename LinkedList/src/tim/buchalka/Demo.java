package tim.buchalka;

/**
 * Jul 17 ,9.05 
 */
import java.util.*;

public class Demo {
	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<>();

		addInOrder(ll, "Janakpur");
		addInOrder(ll, "Aanakpur");
		addInOrder(ll, "Pnakpur");
		addInOrder(ll, "Skpur");
		addInOrder(ll, "Dhirapur");

		//printList(ll);
		//addInOrder(ll, "Dhirapur");
		//printList(ll);
		visit(ll);
	}

	private static void printList(LinkedList<String> lli) {
		Iterator<String> i = lli.iterator();
		while (i.hasNext()) {
			System.out.println("now visiting " + i.next());
		}
		System.out.println("================================");
	}

	private static boolean addInOrder(LinkedList<String> link, String newPlace) {
		ListIterator<String> stringListIterator = link.listIterator();
		while (stringListIterator.hasNext()) {
			int comparison = stringListIterator.next().compareTo(newPlace);
			if (comparison == 0) {
				System.out.println(newPlace + " is already in your list.");
				return false;
			} else if (comparison > 0) {
				stringListIterator.previous();
				stringListIterator.add(newPlace);
				return true;

			} else if (comparison < 0) {

			}

		}
		stringListIterator.add(newPlace);
		return true;

	}

	public static void visit(LinkedList<String> places) {
		printMenu();
		Scanner s = new Scanner(System.in);
		boolean quit = false;
		boolean goingForward=true;

		ListIterator<String> li = places.listIterator();
		if (places.isEmpty()) {
			System.out.println("no cities in  list");
		} else {
			System.out.println("now visiting " + li.next());
		}
		while (!quit) {
			System.out.println("Enter your choice");

			int action = s.nextInt();
			s.nextLine();

			switch (action) {
			case 0:
				System.out.println("Holiday over");
				quit = true;
				break;
			case 1:
				if(!goingForward) {
					if(li.hasNext()) {
						li.next();
					}
					goingForward=true;
				}
				if (li.hasNext()) {
					System.out.println("now visiting " + li.next());
				} else {
					System.out.println("reached the end in the list.");
					goingForward=false;
				}
				break;
			case 2:
				if(goingForward) {
					if(li.hasPrevious()) {
						li.previous();
					}
					goingForward=false;
				}
				if (li.hasPrevious()) {
					System.out.println("now visiting " + li.previous());
				} else {
					System.out.println("reached at top of the list");
					goingForward=true;
				}
				break;
			case 3:
				printMenu();
				break;
			}
		}
	}

	private static void printMenu() {
		System.out.println("Available actions:\npress\n" + "0--to quit\n" + "1--1go to next city\n"
				+ "2--go to previous city\n" + "3--print menu option");
	}
}

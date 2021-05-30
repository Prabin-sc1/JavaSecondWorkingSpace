import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	private static Scanner s = new Scanner(System.in);
	private static FilmList film = new FilmList();

	public static void main(String[] args) {

		// film.add("Ram");
		// film.print();
		printInstructions();
		int choice = 0;
		boolean quit = false;
		while (!quit) {
			System.out.println("Enter your choice:");
			choice = s.nextInt();
			s.nextLine();
			switch (choice) {
			case 1:
				printInstructions();
				break;
			case 2:
				film.print();
				break;
			case 3:
				addFilm();
				break;
			case 4:
				quit = true;
				break;
			case 5:
				modifyFilm();
				break;
			case 6:
				searchMovie();
				break;
			case 7:
				removeFilm();
				break;
			case 8: processArrayList();
			break;

			default:
				System.out.println("Wrong choice");
				break;
			}
		}

	}

	public static void printInstructions() {
		System.out.println("Enter:\n" + "\t 1.to print Instructions\n" + "\t 2.to print film in film list.\n"
				+ "\t 3.to add film\n" + "\t 4.quit\n" + "\t 5.to modfiy\n" + "\t 6.to search movie\n"
				+ "\t 7.to remove\n"+"\t 8.To copy");
	}

	public static void addFilm() {
		System.out.println("Enter name of film:");
		film.add(s.nextLine());
	}

	public static void modifyFilm() {
		System.out.println("Enter name of movie that you wanna modify: ");
		String pos = s.nextLine();
		System.out.println("enter new film");
		String newFilm = s.nextLine();
		film.modify(pos, newFilm);
		System.out.println("Film " + pos + " was modified with " + newFilm);
	}

	public static void removeFilm() {
		System.out.println("Enter the name of film that you wanna remove:");
		String pos = s.nextLine();
		film.remove(pos);
		System.out.println("Film " + pos + " was removed Successfully");

	}

	public static void searchMovie() {
		System.out.println("Enter the name of movie that you want search ");
		String name = s.nextLine();
		if (film.search(name)) {
			System.out.println("Found " + name + " in the film list.");
		} else {
			System.out.println("Not found " + name + " in the film list.");
		}

	}

	public static void processArrayList() {
		//ArrayList<String> newArrayList=new ArrayList<>();
		//newArrayList.addAll(film.getFilm());
		ArrayList<String> newArrayList=new ArrayList<>(film.getFilm());
		System.out.println(newArrayList);
		String[] normalString=new String[film.getFilm().size()];
		normalString=film.getFilm().toArray(normalString);
		

	}
}

package series.playlist.using.linkedlist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Series {
	private static ArrayList<Season> seasons = new ArrayList<>();
	private static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		Season season = new Season("Stranger Things", 1);
		season.addEpisode("Hawking city", 40.05, 1);
		season.addEpisode("Docter", 39.26, 2);
		season.addEpisode("The police Man", 45.06, 3);
		season.addEpisode("Mom", 45.06, 4);
		season.addEpisode("Found", 45.05, 5);
		season.addEpisode("Supernautral", 40.15, 6);

		seasons.add(season);
		season = new Season("Stranger Things", 2);
		season.addEpisode("City", 40.05, 1);
		season.addEpisode("Docter strange", 39.26, 2);
		season.addEpisode("The police ", 45.06, 3);
		season.addEpisode("Brother", 45.06, 4);
		season.addEpisode("Lost", 45.05, 5);
		season.addEpisode("Super", 40.15, 6);
		seasons.add(season);

		LinkedList<Episode> playList = new LinkedList<>();
		seasons.get(0).addToPlayList(2, playList);
		seasons.get(0).addToPlayList(1, playList);
		seasons.get(0).addToPlayList(4, playList);
		seasons.get(0).addToPlayList(5, playList);
		seasons.get(0).addToPlayList(45, playList);

//    	seasons.get(1).addToPlayList("Lost", playList);
//    	seasons.get(1).addToPlayList("Brother", playList);
//    	seasons.get(1).addToPlayList("The police", playList);
//    	seasons.get(1).addToPlayList("City", playList);
//    	seasons.get(1).addToPlayList("Found", playList);

		play(playList);

	}

	private static void play(LinkedList<Episode> playList) {
		printMenu();
		boolean quit = false;
		boolean forward = true;
		int choice = 0;
		ListIterator<Episode> li = playList.listIterator();
		if (playList.size() == 0) {
			System.out.println("There are no any episodes in your play list.");
			return;
		} else {
			System.out.println("Now playing " + li.next().toString());
		}

		while (!quit) {
			System.out.println("Enter your choice:");
			choice = s.nextInt();
			s.nextLine();
			switch (choice) {
			case 0:
				System.out.println("PlayList Complete");
				quit = true;
				break;
			case 1:
				if (!forward) {
					if (li.hasNext()) {
						li.next();
					}
					forward = true;
				}
				if (li.hasNext()) {
					System.out.println("Now playing " + li.next().toString());
				} else {
					System.out.println("We are at the end of list.");
					forward = false;
				}
				break;
			case 2:
				if (forward) {
					if (li.hasPrevious()) {
						li.previous();
					}
					forward = false;
				}
				if (li.hasPrevious()) {
					System.out.println("Now playing " + li.previous().toString());
				} else {
					System.out.println("We are at the top of list.");
					forward = true;
				}
				break;
			case 3:
				if (forward) {
					if (li.hasPrevious()) {
						System.out.println("Now replaying " + li.previous().toString());
						forward = false;
					} else {
						System.out.println("We are at the top of list.");
					}
				} else {
					if (li.hasNext()) {
						System.out.println("Now replaying " + li.next().toString());
						forward = true;
					} else {
						System.out.println("We are at end of list.");
					}
				}
				break;
			case 4:
				printList(playList);
				break;
			case 5:
				printMenu();
				break;
			case 6:
				if (playList.size() > 0) {
					li.remove();
				}
				if (li.hasNext()) {
					System.out.println("Now playing" + li.next());
				} else if (li.hasPrevious()) {
					System.out.println("Now playing" + li.previous());
				}

				break;
			default:
				System.out.println("Invalid choice");
			}
		}
	}

	private static void printMenu() {
		System.out.println("Available Option:\nPress:\n" + "\t 0.to quit\n" + "\t 1.to play next episode\n"
				+ "\t 2.to play previous episode\n" + "\t 3.to replay episode\n" + "\t 4.list episodes in playlist\n"
				+ "\t 5.to print menu\n" + "\t 6.to remove episode from playlist");

	}

	private static void printList(LinkedList<Episode> playList) {
		Iterator<Episode> i = playList.iterator();
		System.out.println("=========================================");
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("==========================================");
	}

}

package inner._class.challenge;

import java.util.*;

public class Main {
	private static ArrayList<Album> albums = new ArrayList<>();

	public static void main(String[] args) {
		Album album = new Album("Pearl Jam", "Eddie Vedar");
		album.add("Last Kiss", 4.05);
		album.add("Society", 2.36);
		album.add("Long Night", 2.05);
		album.add("Guaranteed", 3.15);
		album.add("Rise", 4.51);
		albums.add(album);

		album = new Album("KidsAndHeroes", "Luiz David");
		album.add("Goreto", 4.05);
		album.add("Birey", 5.06);
		album.add("Nepali", 4.15);
		album.add("Inflactuation", 4.05);
		album.add("Birey Nepali", 5.06);
		album.add("Nepali maya", 4.15);
		albums.add(album);
		LinkedList<Song> playList = new LinkedList<>();

		albums.get(0).addToPlayList("Society", playList);
		albums.get(0).addToPlayList("Last Kiss", playList);
		albums.get(0).addToPlayList("Hehe", playList);
		albums.get(0).addToPlayList("Society", playList);
		albums.get(1).addToPlayList(4, playList);
		albums.get(1).addToPlayList(1, playList);
		albums.get(1).addToPlayList(3, playList);
		albums.get(1).addToPlayList(41, playList);

		play(playList);

	}

	public static void play(LinkedList<Song> playList) {

		Scanner s = new Scanner(System.in);
		boolean quit = false;
		boolean forward = true;

		ListIterator<Song> li = playList.listIterator();
		if (playList.size() == 0) {
			System.out.println("no song in playlist");
		} else {
			System.out.println("Now playing " + li.next().toString());
			printMenu();
		}
		while (!quit) {

			 System.out.println("Enter your choice:");
			int choice = s.nextInt();
			s.nextLine();
			switch (choice) {
			case 0:
				System.out.println("Playlist complete");
				quit = true;
				break;

			case 1:
				
				if (!forward) {
					if (li.hasNext()) {
						li.next();
					}
				}
				forward = true;

					if (li.hasNext()) {
						System.out.println("Now playing " + li.next().toString());
					} else {
						System.out.println("We have reached end of the playlist");
						forward = false;
					}
					break;

				
				
			case 2:
				if (forward) {
					if (li.hasPrevious()) {
						li.previous();
					}
				}
					forward = false;
					if (li.hasPrevious()) {
						System.out.println("Now playing " + li.previous().toString());
					} else {
						System.out.println("We have reached top of the playlist");
						forward = true;
					}
				break;
			case 3:
				if(forward) {
					if(li.hasPrevious()) {
						System.out.println("Now replaying "+li.previous().toString());
						forward=false;
					}
					else {
						System.out.println("we are at start of list");

					}
				}
					else {
						if(li.hasNext()) {
							System.out.println("Now replaying "+li.next().toString());
							forward=true;
						}
						else {
							System.out.println("we are at end of list");
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
					li.remove();
				if(li.hasNext()) {
					System.out.println("Now playing "+li.next());
				}else if(li.hasPrevious()) {
					System.out.println("Now playing "+li.previous());
					
				}

			
			break;
		}
		}
	}
	public static void printMenu() {
		System.out.println("Enter:\n"+"\t 0.to quit\n"+"\t 1.to play next song\n"+"\t 2.to play previous song\n"+"\t 3.to replay song\n"+"\t 4.list of songs in playlist\n"+
	"\t 5.to print available option\n"+"\t 6.to remove");
		
		
	}
	public static void printList(LinkedList<Song> playList) {
		Iterator<Song> i=playList.iterator();
		System.out.println("=========================================");
        while(i.hasNext()) {
        	System.out.println(i.next());
        }
    	System.out.println("=========================================");
	}

	
	
	
	
	
	
	
	

}

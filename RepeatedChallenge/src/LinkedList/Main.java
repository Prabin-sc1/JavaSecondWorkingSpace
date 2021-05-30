package LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

import java.util.Iterator;

public class Main {
     private static ArrayList<Album>albums=new ArrayList<Album>();
	public static void main(String[] args) {
		Album album=new Album("Stormbringer","Deep purple");
		album.addSong("aaaaa", 4.05);
		album.addSong("bbbbb", 2.05);
		album.addSong("ccccc", 4.01);
		album.addSong("ddddd",2.56);
		album.addSong("eeeee",5.01);
		albums.add(album);
		
		album=new Album("AAAAA","BBBBB");
		album.addSong("aaaaaa", 4.05);
		album.addSong("bbbbbb", 2.05);
		album.addSong("cccccc", 4.01);
		album.addSong("dddddd",2.56);
		album.addSong("eeeeee",5.01);
		albums.add(album);
       
		LinkedList<Song> playList=new LinkedList<>();
		albums.get(0).addToPlayList(2, playList);
		albums.get(0).addToPlayList(4, playList);
		albums.get(0).addToPlayList(3, playList);
		albums.get(0).addToPlayList(55, playList);
		albums.get(1).addToPlayList("aaaaaa", playList);
		albums.get(1).addToPlayList("bbbbbb", playList);
		albums.get(1).addToPlayList("cccccc", playList);
	    albums.get(1).addToPlayList("eeeeeee", playList);
	    albums.get(1).addToPlayList("aaaaafdsfa", playList);
	    
	    play(playList);
	    

}
	private static void play(LinkedList<Song> playList) {
		printMenu();
		Scanner s=new Scanner(System.in);
		boolean quit=false;
		boolean forward=true;
		int choice=0;
		ListIterator<Song> li=playList.listIterator();
		if(playList.size() == 0) {
			System.out.println("no songs in playlist");
			return;
		}
		
		else {
			System.out.println("Now playing "+li.next().toString());
		}
		while(!quit) {
			System.out.println("Enter your choice:");
			choice=s.nextInt();
			s.nextLine();
			switch(choice) {
			case 0:
			System.out.println("Playlist complete");
			quit=true;
			break;
			case 1:
				if(!forward) {
					if(li.hasNext()) {
						li.next();
					}
					forward=true;
				}
				if(li.hasNext()) {
					System.out.println("Now playing "+li.next().toString());
				}else {
					System.out.println("we are at the end of list");
					forward=false;
				}
				break;
			case 2:
				if(forward) {
					if(li.hasPrevious()) {
                       li.previous();						
					}
					forward =false;
				}
				if(li.hasPrevious()) {
					System.out.println("Now playing "+li.previous().toString());
				}else {
					System.out.println("We are at top of list.");
					forward=true;
				}     
				break;
			case 3:
				if(forward) {
					if(li.hasPrevious()) {
						System.out.println("Now replaying "+li.previous().toString());
						forward=false;
					}else {
						System.out.println("we are at top of list");
						
					}
				}
				else {
					if(li.hasNext()) {
						System.out.println("Now replaying "+li.next().toString());
						forward=true;
					}else {
						System.out.println("we are at the end of list");
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
				if(playList.size()>0) {
				li.remove();
				if(li.hasNext()) {
					System.out.println("Now playing "+li.next());
				}else if(li.hasPrevious()) {
					System.out.println("Now playing "+li.previous());
				}
				}
				break;
			default:
				System.out.println("Invalid choice");
				
			}
			
		}	
	}
	private static void printMenu() {
		System.out.println("Available Option:\nPress:\n"+"\t 0.to quit\n"+"\t 1.to play next song\n"+"\t 2.to play previous song\n"+"\t 3.to replay song\n"+"\t 4.list songs in playlist\n"+"\t 5.to print menu\n"+"\t 6.to remove from playlist");
	}
	private static void printList(LinkedList<Song> playList) {
	Iterator i=playList.iterator();
		System.out.println("---------------------------------------");
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("---------------------------------------");
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
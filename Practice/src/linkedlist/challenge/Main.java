package linkedlist.challenge;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
private static ArrayList<Album> albums=new ArrayList<>();
	public static void main(String[] args) {
		Album album =new Album("Stormbringer","Deep purple");
		album.addSong("Stormbringer",4.05);
		album.addSong("Love don't mean a thing",4.06);
		album.addSong("Holy man",4.5);
		album.addSong("Lady double dealer",4.15);
		album.addSong("You can do it right",4.25);
		album.addSong("High ball shooter", 3.55);
		album.addSong("The gypsy", 4.21);
		album.addSong("Soldier of fortune", 3.13);
		albums.add(album);
		
		album =new Album("For those about to rock","AC/DC");
		album.addSong("For those about to rock", 4.12);
		album.addSong("I put finger on you",4.06);
		album.addSong("Lets go",4.5);
		album.addSong("Inject the venom",4.15);
		album.addSong("Snowballed",4.25);
		album.addSong("Evil walks", 3.55);
		album.addSong("Breaking the rules", 4.21);
		album.addSong("Night of the lion knives", 3.13);
		albums.add(album);

		LinkedList<Song> playList = new LinkedList<>();
		albums.get(0).addToPlaylist("The gypsy", playList);
		albums.get(0).addToPlaylist("Holy man", playList);
		albums.get(0).addToPlaylist("Stormbringer", playList);
		albums.get(0).addToPlaylist("Soldier of fortune", playList);
		albums.get(0).addToPlaylist("Evil walks", playList);
		
		albums.get(1).addToPlaylist("The gypsy", playList);
		albums.get(1).addToPlaylist("Lets go", playList);
		albums.get(1).addToPlaylist("Snowballed", playList);
		albums.get(1).addToPlaylist("Evil walks", playList);
		albums.get(1).addToPlaylist("Night of the lion knives", playList);
		
		play(playList);
		
	}
	
	private static void play(LinkedList<Song> playList) {
		printMenu();
		Scanner s=new Scanner(System.in);
		boolean quit=false;
		boolean forward = true;
		ListIterator<Song> li = playList.listIterator();
		
		if(playList.size() == 0) {
			System.out.println("No songs in playlist");
			return;
		}else {
		System.out.println("Now playing"+li.next().toString());
		}
		while(!quit) {
			int action=s.nextInt();
			s.nextLine();
			switch(action) {
			case 0:
				System.out.println("Playlist complete");
				quit =true;
			case 1:
				if(!forward){
					if(li.hasNext()) {
						li.next();
					}
					forward = true;
				}
				if(li.hasNext()) {
					System.out.println("Now playing "+li.next().toString());
					
				}
				else {
					System.out.println("we have reached end of the playlist");
					forward =false;
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
					System.out.println("we are at the top of list");
					forward=true;
				}
				break;
			case 3:
				if(forward) {
					if(li.hasPrevious()) {
						System.out.println("Now playing "+li.previous().toString());
						forward=false;
					}else {
						System.out.println("we are at the start of list");
						forward=true;
					}
				}else {
					if(li.hasNext()) {
						System.out.println("Now playing "+li.next().toString());
						forward=true;
					}else {
						System.out.println("we are at the end of list");
						forward = false;
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
				if(playList.size() > 0) {
					li.remove();
					if(li.hasNext()) {
						System.out.println("Now playing "+li.next());
					}else if(li.hasPrevious()) {
						System.out.println("Now playing "+li.previous());
					}
				}
				break;
			
			}
			
		
		}
		
	}
	private static void printMenu() {
		System.out.println("Enter:\n"+"\t0.to quit\n"+"\t1.to play next song\n"+"\t2.to play previous song\n"+"\t3.to replay song\n"+"\t4.to list songs in the playlist\n"+"\t5.print available actions\n"+"\t6.to remove");
	}
	
	private static void printList(LinkedList<Song> playList){
		Iterator<Song> i =playList.iterator();
		System.out.println("===============================================");
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("================================================");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

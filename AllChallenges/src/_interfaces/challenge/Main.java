package _interfaces.challenge;

import java.util.ArrayList;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Player ram=new Player("Ram",14,25);
		System.out.println(ram.toString());
		savedValues(ram);
	System.out.println();
		ram.setHitPoints(5);
		ram.setWeapon("Gun");
		savedValues(ram);
		System.out.println();
	//	loadValues(ram);
		//System.out.println(ram);
	//	savedValues(ram);
		
		Saveable wolf = new Monster("Wolf",20,40);
		System.out.println("Strength:"+((Monster) wolf).getStrength());
		//As you can above reference variable of interface Saveable was keeping the object of Monster 
		//So,you can only implement method of interface 
		//Inorder to implement the method of Monster class you can do like[ System.out.println("Strength:"+((Monster) wolf).getStrength());]
		// Or,you can make reference variable of that class that implementing interface
        System.out.println(wolf.toString());
        savedValues(wolf);
		
		
	}

	
	public static ArrayList<String> readValues(){
		ArrayList<String> values=new ArrayList<>();
		
		Scanner s =new Scanner(System.in);
		boolean quit =false;
		int index=0;
		System.out.println("Enter: \n"+"\t 1.to enter a string\n"+"\t 0.to quit");
		
		while(!quit) {
			System.out.println("Enter your choice");
			int choice=s.nextInt();
			s.nextLine();
			switch(choice) {
			case 0:
				quit=true;
				break;
			case 1:
				System.out.println("Enter a string");
				String inputString =s.nextLine();
				values.add(index,inputString);
				index++;
				break;
			}
		}
		return values;
	}
	public static void savedValues(Saveable objectToSave ) {
		for(int i=0;i<objectToSave.write().size();i++) {
			System.out.println("Saving "+objectToSave.write().get(i)+" to storage device.");
		}
	}
	public static void loadValues(Saveable objectToLoad) {
		ArrayList<String> values=readValues();
		objectToLoad.read(values);
	}
	
}
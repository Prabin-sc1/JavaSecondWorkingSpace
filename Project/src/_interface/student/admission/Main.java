package _interface.student.admission;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Student s=new SE("Prabin",2.5);
		System.out.println(s.toString());
		saveObject(s);
		System.out.println();
		loadObject(s);
		System.out.println(s);
		saveObject(s);
	}
	public static ArrayList<String> readValues() {
		ArrayList<String> values=new ArrayList<>();
		Scanner s=new Scanner(System.in);
		boolean quit = false;
		int index=0;
		
		System.out.println("Enter:"+"\t 1.to enter a string\n"+"\t 0.quit");
		
		while(!quit) {
			System.out.println("Enter your choice");
			int choice=s.nextInt();
			s.nextLine();
			
			switch(choice) {
			case 0:
				quit =true;
				break;
			case 1:
				System.out.println("Enter a string");
				String inputString=s.nextLine();
				values.add(index,inputString);
				index++;
				break;
				
			}
		}return values;
	}
	public static void saveObject(Student objectToSave) {
	  for(int i=0;i<objectToSave.write().size();i++) {
		  System.out.println("Saving "+objectToSave.write().get(i)+" to storage.");
	  }
	}
	  public static void loadObject(Student objectToLoad) {
		  ArrayList<String> values=readValues();
		  objectToLoad.read(values);
	  
	}
	

}

import java.util.Arrays;
import java.util.Scanner;

public class Minimum {
private static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the size of array:");
		int[] enteredValue=getInteger(s.nextInt());
		
		printInstructions();
		
	
		
		boolean quit=false;
		while(!quit) {
			int choice=s.nextInt();
			s.nextLine();
			
		switch(choice) {
		case 1:
			printInstructions();break;
		case 2:
			System.out.println("Your entered value is:");
			printArray(enteredValue);
			break;
		case 3:
			int returnedMin=minNumber(enteredValue);
			System.out.println("Minimum value:"+returnedMin);
			break;
		case 4:
			reverseNumber(enteredValue);
			System.out.println("Arrays in reverse order:\n"+Arrays.toString(enteredValue));
			break;
		case 5:
			System.out.println("sorted:");
			System.out.println(Arrays.toString(sort(enteredValue)));
			break;
			
		case 6:
			quit=true;
				break;
			
		}
	}		
		
	
		
		//System.out.println();
		
	
	

	}
	public static void  printInstructions() {
		System.out.println("Enter:\n"+"\t1. To print choice option\n"+"\t2.To print entered Value\n"+
				"\t3.To print Minimum\n"+"\t4.To print in Reverse Order\n"
				+"\t5.For sorting\n"+"\t6.Quit");
		
	}
	public static int[] getInteger(int number) {
		System.out.println("Enter "+number+" integers.");
		int[] values=new int[number];
		for(int i=0;i<values.length;i++) {
			values[i]=s.nextInt();
		}
		return values;
				
	
	
	}
	public static void printArray(int[] array) {
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
		
	}
	public static int minNumber(int [] array) {
		int min=Integer.MAX_VALUE;
		for(int i=0;i<array.length;i++) {
			int value=array[i];
			if(value<min) {
				min=value;
				
			}
			
		}
		return min;
	}
	
	//1,2,3,4,5
	//5,4,3,2,1
	public static void reverseNumber(int[] array) {
		int n=array.length;
		int maxIndex=array.length-1;
		for(int i=0;i<n/2;i++) {
			int temp=array[i];
			array[i]=array[maxIndex-i];
			array[maxIndex-i]=temp;
			
		}
		
	}
	public static int[] sort(int[] array) {
		int[] sorted=Arrays.copyOf(array, array.length);
		boolean flag=true;
		int temp;
		while(flag) {
			flag=false;
			for(int i=0;i<array.length-1;i++) {
				if(sorted[i]<sorted[i+1]) {
					temp=sorted[i];
					sorted[i]=sorted[i+1];
					sorted[i+1]=temp;
					flag=true;
				}
			}
			
		}
		return sorted;
	}

}

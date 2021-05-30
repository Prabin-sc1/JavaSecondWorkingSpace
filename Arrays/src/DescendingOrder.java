import java.util.Arrays;
import java.util.Scanner;

public class DescendingOrder {
	private static Scanner s=new Scanner(System.in);
public static void main(String[] args) {
	System.out.println("Enter array size:");
	int[] enteredInteger=getInteger(s.nextInt());
	System.out.println("Here is integer that you entered before:");
	printArray(enteredInteger);
	System.out.println();

	int[] sorted=sortInteger(enteredInteger);
	
	System.out.println("In Descending order");
	printArray(sorted);
			}
   public static int[] getInteger(int number) {
	   int[] values=new int[number];
	   System.out.println("Enter "+number+" integers.");
	   for(int i=0;i<values.length;i++) {
		   values[i]=s.nextInt();
	   }
	   return values;
	   
	   
   }
   public static void printArray(int[] enteredArray) {
	   for(int i=0;i<enteredArray.length;i++) {
		   System.out.println(enteredArray[i]);
	   }
   }
   public static int[] sortInteger(int[] enteredArray) {
//	   int[] sortedArray=new int[enteredArray.length]; 
//	   for(int i=0;i<enteredArray.length;i++) {
//		   sortedArray[i]=enteredArray[i];
//	   }
	   
	   // I'm using built in copy method
	   
	   int[] sortedArray=Arrays.copyOf(enteredArray, enteredArray.length);
	   boolean flag=true;
	   int temp;
	   while(flag) {
		   flag =false;
		   for(int i=0;i<enteredArray.length-1;i++) {
			   if(sortedArray[i]<sortedArray[i+1]) {
				   temp=sortedArray[i];
				   sortedArray[i]=sortedArray[i+1];
				   sortedArray[i+1]=temp;
				   flag=true;
			   }
		   }
	   }
	   return sortedArray;
   }

}

import java.util.Scanner;

public class Main {
	private static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter how many array of integers:");

		int[] enteredIntegerValue = getInteger(s.nextInt());
		System.out.println("Here your entered value:");
		for (int i = 0; i < enteredIntegerValue.length; i++) {
			System.out.println(enteredIntegerValue[i]);
		}
		
		System.out.println("The Average is:"+getAverage(enteredIntegerValue));
		

	}

	public static int[] getInteger(int number) {
		System.out.println("Enter " + number + " integers.");
		int[] values = new int[number];
		for (int i = 0; i < values.length; i++) {
			values[i] = s.nextInt();
		}
		return values;
	}
	public static double getAverage(int[] array) {
		int sum=0;
		for(int i=0;i<array.length;i++) {
			sum+=array[i];
		}
		return (double) sum/array.length;
		
	}

		
	

}

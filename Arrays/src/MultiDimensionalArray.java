import java.util.Scanner;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int rows=s.nextInt();
		int columns=s.nextInt();
		int a[][]=new int[rows][columns];
		int b[][]=new int[rows][columns];
	 
		System.out.println("Enter first 2d array:");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				//System.out.println(a[rows][columns]);
            a[i][j]=s.nextInt();
			}
		}
		System.out.println("Here your  first entered 2d array:");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				System.out.println(a[i][j]);
			}
		}
		System.out.println("Enter second 2d array:");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				//System.out.println(a[rows][columns]);
            b[i][j]=s.nextInt();
			}
		}
		System.out.println("Here your second entered 2d array:");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				System.out.println(b[i][j]);
			}
		}
		
		int c[][]=new int[rows][columns];
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		System.out.println("Sum Result:");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				System.out.println(c[i][j]);
			}
		}
		
		


	}

}

package learning.two.d.array;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter dimension:");
		 int rows=s.nextInt();
		 int columns=s.nextInt();
		
		 
		 int [][] a =new int[rows][columns];
		 int [][] b=new int[rows][columns];
    
		 System.out.println("enter array a[][]");
		 for(int i=0;i<rows;i++) {
			 for(int j=0;j<columns;j++) {
				 a[i][j]=s.nextInt();
			 }
		 }
		 System.out.println("enter arrays b[][]");
		 for(int i=0;i<rows;i++) {
			 for(int j=0;j<columns;j++) {
				 b[i][j]=s.nextInt();
			 }
		 }
		 
		 int [][] c=new int[rows][columns];
		 
		 for(int i=0;i<rows;i++) {
			 for(int j=0;j<columns;j++) {
				 c[i][j]=a[i][j]+b[i][j];
			 }
		 }
		 System.out.println("result is");
		 for(int i=0;i<rows;i++) {
			 for(int j=0;j<columns;j++) {
				System.out.print(c[i][j]+" ");
			 }
			 System.out.println();
		 }

	}

}

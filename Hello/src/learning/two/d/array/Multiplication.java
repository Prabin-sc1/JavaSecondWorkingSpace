package learning.two.d.array;

import java.util.Scanner;

public class Multiplication {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Multiplication of matrix:");
		System.out.println("Enter first dimension:(e.g.a[][])");

		int row1 = s.nextInt();
		int column1 = s.nextInt();
		
		

		int[][] a = new int[row1][column1];
		
		System.out.println("Enter first array");
		for (int i = 0; i < row1; i++) {
			for (int j = 0; j < column1; j++) {
				a[i][j] = s.nextInt();
			}
		}
		System.out.println("Enter second dimension:(e.g.b[][])");
		int row2 = s.nextInt();
		int column2 = s.nextInt();
		int[][] b = new int[row2][column2];
		System.out.println("Enter second array");
		for (int i = 0; i < row2; i++) {
			for (int j = 0; j < column2; j++) {
				b[i][j] = s.nextInt();
			}
		}

		int sum = 0;
		int[][] c = new int[row1][column2];
		for (int i = 0; i < row1; i++) {
			for (int j = 0; j < column2; j++) {
				for (int k = 0; k < column1; k++) {
					sum = sum + a[i][k] * b[k][j];
				}
				c[i][j] = sum;
				sum = 0;
			}
		}

//		int[][] c=new int[rows][columns];
//		
//		//if(a[rows]==b[columns]) {
//			for(int i=0;i<rows;i++) {
//				for(int j=0;j<columns;j++) {
//					c[i][j]=a[i][j]+b[i][j];				
//					}
//			}
//				
		// }
		System.out.println("result is:");
		for (int i = 0; i < row1; i++) {
			for (int j = 0; j < column2; j++) {
				System.out.print(c[i][j] + " ");
			}
			System.out.println();

		}

	}
}

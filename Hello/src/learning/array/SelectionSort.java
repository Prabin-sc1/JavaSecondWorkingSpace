package learning.array;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
	//	int a[]= {3, 5, 6, -7, 9};
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the no. of array");
		int r=s.nextInt();
		
		int b[]=new int[r];
		
		for(int i=0;i<r;i++) {
           System.out.println("enter "+ r +" number");
			b[i]=s.nextInt();
		}
		int n=b.length;
		for(int i=0;i<n-1;i++) {
			int minIndex=i;
			for(int j=i;j<n;j++) {
				if(b[j]<b[minIndex]) {
					minIndex=j;
				}
				
			}
			int temp=b[i];
			b[i]=b[minIndex];
			b[minIndex]=temp;
		}
		for(int e:b)
			System.out.print(e+" ");

	}

}

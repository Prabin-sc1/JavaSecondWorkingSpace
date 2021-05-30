package learning.array;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		//int a[]= {8, 4, 5, 7, 9};
		Scanner s=new Scanner(System.in);
		System.out.println("enter 1 d array as you want to be sorted ascending order");
		int p=s.nextInt();
		
		int[] b=new int[p];
		
		for(int i=0;i<p;i++)
		{
		   b[i]=s.nextInt();
		}
//		for(int i=0;i<p;i++)
//		{
//		   b[i]=s.nextInt();
//		}
		
		
		int n=b.length;
		for(int i=0;i<n-1;i++) {
			boolean sorted=true;
			for(int j=0;j<n-1-i;j++) {
				if(b[j+1]<b[j]) {
					int temp=b[j+1];
					b[j+1]=b[j];
					b[j]=temp;
					sorted =false;
				}
					
				}
			if(sorted)
				break;
			}
			for(int item: b) {
				System.out.print(item+" ");
			}
			
		}

	}



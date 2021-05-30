import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
		//int a[] = { 4, 5, 2, 3, -2, 6 };
		//int l = a.length;
		System.out.println("enter how many arrays?");
       int b=s.nextInt();
       
       int []p=new int[b];
       
       for(int i=0;i<b;i++) {
    	 p[i]=s.nextInt();
       }
       int l=p.length;
		for (int i = 0; i < l-1-i; i++) {
			boolean sorted=true;
			for (int j = 0; j < l-1; j++) {
				if (p[j + 1] < p[j]) {
					int temp = p[j];
					p[j] = p[j + 1];
					p[j + 1] = temp;
					sorted=false;
				}
			}
			if(sorted)
				break;
			

		}
		for(int arr:p) {
			System.out.print(arr+" ");
		}
	}

}

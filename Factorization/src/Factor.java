import java.util.Scanner;

public class Factor {
	
	private static int listFactors(int n) {
		int counter=0;
		for(int i=1;i<=n;i++) {
			if(n % i==0) {
				if(counter>0) {
					System.out.print(", ");
				}
				System.out.print(i);
				counter++;
			}
		}
		System.out.println();
	//	System.out.println("number of factors: "+counter);
		return counter;
	}
	
	public static void main(String[] args) throws IllegalStateException {
	
		Scanner s=new Scanner(System.in);
		int iterations=0;
		while(true) {
			iterations++;
			System.out.println("Enter an integer number:");
			int k=s.nextInt();
			if(k<0) {
				k=-k;
			}
		
		System.out.println("number of factors:"+listFactors(k));
	//	s.close();
		
	}
		
	}
	


}

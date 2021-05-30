import java.util.Scanner;

public class Pythagorean {

	private static int allPythagoreanNumbers(int upperBound) {
		int count=0;
	    for(int a=1;a<upperBound;a++) {
	    	for(int b=a;b<upperBound;b++) {
	    		for(int c=b;c<upperBound;c++) {
	    			if(a*a+b*b==c*c) {
	    				System.out.println("(" +a+ "," +b+ "," +c+ ")");
	    				count++;
	    			}
	    		}
	    	}
	    }
	    return count;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		System.out.println("Total count:"+allPythagoreanNumbers(s.nextInt()));
	}
}

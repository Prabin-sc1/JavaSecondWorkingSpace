
public class Palindrome {
	public static void main(String[] args) {
     //Palindrome.countDivisibility();
     Palindrome.countDivisibility();	
	}
	private static boolean isPalindrome(String numberStr) {
		String reversed=new StringBuffer(numberStr).reverse().toString();
		return reversed.equals(numberStr);
	}
	private static void countDivisibility() {
		int count=0;
		int total=0;
		for(int i=1000;i<10001;i++) {
			if(isPalindrome(Integer.toString(i))) {
			total++;
			if(i%7==0) {
				count++;
				System.out.println(i);
			}
		}
	}
		System.out.println("Probability="+count+"/"+total);
	}
	
}

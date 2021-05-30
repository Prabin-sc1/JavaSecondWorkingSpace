
public class Main {
	public static void main(String[] args) {
		Main.countNumbers();
		
	}
	public static void countNumbers() {
    int totalCount=0;
    for(int i=1000;i<10000;i++) {
  	if(i % 3 == 0 && i % 100 == 23) {
	        int firstDigit=i/1000;
    		int secondDigit=i/100%10;
    		if(firstDigit!=secondDigit && firstDigit!=2 && firstDigit!=3 && 
    				secondDigit!=2 && secondDigit!=3) {
 			totalCount++;
    			System.out.println(i);
    		}
    		
    	}
    }
    System.out.println("totalCount="+totalCount);
	}

}

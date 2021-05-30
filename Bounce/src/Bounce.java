
public class Bounce {
public static void main(String[] args) {
	System.out.println(ballBouncing(50.0));
}
public static int ballBouncing(double originalHeight) {
	double currentHeight=originalHeight;
	int count=0;
	while(currentHeight>0.5) {
		currentHeight=currentHeight*2/3;
		count++;
		System.out.println("Bounce no.:"+count+"; current height="+currentHeight);
		
	}
	return count;
}
}

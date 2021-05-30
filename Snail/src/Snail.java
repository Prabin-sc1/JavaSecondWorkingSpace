
public class Snail {
	public static void main(String[] args) {
		Snail.snail();
	}
	private static void snail() {
		final int DEPTH=40*12;
		int currentHeight=0;
		int numOfDays=0;
		while(currentHeight<DEPTH) {
			currentHeight+=12*4;
			numOfDays++;
			if(currentHeight>=DEPTH) {
				break;
			}
			currentHeight-=12*2+6;
			System.out.println("No. "+numOfDays+"day -"+(DEPTH-currentHeight)+ " inches to the top." );
		
		}System.out.println("No. "+numOfDays+"day -at the top");
	}
}

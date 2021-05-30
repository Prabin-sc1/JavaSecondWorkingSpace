package learning.collections.edu;

public class Main {

	public static void main(String[] args) {
		Theatre t = new Theatre("QFX", 8, 12);
		//t.getSeats();
		if (t.reservedSeat("Z12")) {
			System.out.println("Please pay");
		} else

		{
			System.out.println("Seat is already taken.");
		}
		
	}

}

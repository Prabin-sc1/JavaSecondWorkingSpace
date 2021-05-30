import java.util.Scanner;

public class Day {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter year and month:");
	System.out.println(tellNumberOfDaysByYearMonth(s.nextInt(),s.nextInt()));
	}
	private static int tellNumberOfDaysByYearMonth(int year,int month) {
		int numOfDays=0;
		switch(month) {
		case 1:case 3:case 5:
		case 7:case 8:case 10:
		case 12:
			numOfDays=31;
			break;
		case 4:case 6:
		case 9:case 11:
			numOfDays=30;
			break;
		case 2:
			if((year%4==0 && year%100!=0)|| year%400==0) {
				numOfDays=29;
			}else {
				numOfDays=28;
		}
		break;
		
		
	
default:
	break;
	}
return numOfDays;
}
}
	

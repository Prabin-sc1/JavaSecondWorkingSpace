
public class Main {

	public static void main(String[] args) {
		Printer printer =new Printer(true,40);
		System.out.println("initial pages count "+printer.getPagesPrinted());
		int pagesPrinted=printer.printPages(5);
		System.out.println("Pages printed was "+pagesPrinted+" new total print count for printer = "
				+printer.getPagesPrinted());
		pagesPrinted=printer.printPages(2);
		System.out.println("Pages printed was "+pagesPrinted+" new total print count for printer = "
				+printer.getPagesPrinted());



	}

}

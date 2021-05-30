
public class Printer {
   private boolean duplex;
   private int pagesPrinted;
   private int tonnerLevel;
   
   public Printer(boolean duplex,int tonnerLevel) {
	   this.duplex=duplex;
	   this.pagesPrinted=0;
	   if(tonnerLevel>-1 && tonnerLevel<=100) 
		   this.tonnerLevel=tonnerLevel;
	   
   }
   
   public int addTonner(int tonnerAmount) {
	   if(tonnerAmount>0 && tonnerAmount<=100) {
		   if(this.tonnerLevel+tonnerAmount>100) {
			   return -1;
		   } 
		   this.tonnerLevel+=tonnerAmount;
		   return this.tonnerLevel;
	   }
	   else {
		   return -1;
	   }
	   
   }
   public int printPages(int pages) {
	   int pagesToPrint=pages;
	   if(this.duplex) {
		   pagesToPrint=pagesToPrint/2+pagesToPrint%2;
		   System.out.println("Printing is duplex mode.");
	   }
	   else {
		   System.out.println("Printing is simplex mode.");
	   }
	   this.pagesPrinted+=pagesToPrint;
	   return pagesToPrint;
   }
   
   public int getPagesPrinted() {
	   return pagesPrinted;
   }
   
}

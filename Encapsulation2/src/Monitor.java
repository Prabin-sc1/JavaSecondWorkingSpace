
public class Monitor {
   private boolean theLED;
   private Resolution resolution;
   private int marketPrice;
   
    public Monitor(boolean theLED, Resolution resolution) {
	   super();
	   this.theLED = theLED;
	   this.resolution = resolution;
	   this.marketPrice=0;
}

	public int retailPrice(int price) {
		
		if(this.theLED) {
			
			System.out.println("LED monitor");
			
		}else {
			System.out.println("LCD monitor");

		}
		return price;
		
	}

	public Resolution getResolution() {
		return resolution;
	}
    
	
   
   
}


public class MilkTea extends Tea {
	private String addItem1;
	private double item1Price;

	public MilkTea(String name, double price) {
		super(name, price);
		
	}
    public void addItemOnMilkTea(String name,double price) {
    	this.addItem1=name;
    	this.item1Price=price;
    }
	@Override
	public double itemizeTheItem() {
		double firstPrice=super.itemizeTheItem();
		if(this.addItem1!=null) {
			firstPrice+=this.item1Price;
			System.out.println("Added "+this.addItem1+" with price "+this.item1Price);
		}
		return firstPrice;
	}
    
}

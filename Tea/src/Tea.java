
public class Tea {
	private String name;
	private double price;
	
	private String addItem1;
	private double item1Price;
	
	private String addItem2;
	private double item2Price;
	
	
	
	public Tea(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	public void addItem1OnTea(String name,double price) {
    this.addItem1=name;
    this.item1Price=price;
	}
	
	public void addItem2OnTea(String name,double price) {
	    this.addItem2=name;
	    this.item2Price=price;
		}
	
	public double  itemizeTheItem() {
		double initialPrice=this.price;
		System.out.println(this.name+" tea "+",price: "+this.price);
		if(this.addItem1!=null) {
			initialPrice+=this.item1Price;
			System.out.println("Added "+this.addItem1+" with price "+this.item1Price);
		}
		if(this.addItem2!=null) {
			initialPrice+=this.item2Price;
			System.out.println("Added "+this.addItem2+" with price "+this.item2Price);
		}
		return initialPrice;
	}
		

}

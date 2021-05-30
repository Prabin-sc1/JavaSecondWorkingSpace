
public class Main {
    public static void main(String[] args) {
    	Tea tea=new Tea("Black",15.0);
    	//tea.itemizeTheItem();
    	tea.addItem1OnTea("coffee",15);
    	tea.addItem2OnTea("milk", 10);
    	
    	
    	System.out.println("Total bill:"+tea.itemizeTheItem());
    	System.out.println();
    	
    	MilkTea milkTea =new MilkTea("Milk",35);
        milkTea.addItem1OnTea("sugar", 5);
        milkTea.addItemOnMilkTea("coffee", 20);
        System.out.println(milkTea.itemizeTheItem());
    }
}

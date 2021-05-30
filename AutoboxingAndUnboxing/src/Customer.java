import java.util.ArrayList;

public class Customer {
	private String name;
	private ArrayList<Double> transactions;

	public Customer(String name, double initialAmount) {

		this.name = name;
		this.transactions = new ArrayList<>();
		addTransactions(initialAmount);// performing initial amount and subsequent amount at same time
		
	}
	public String getName() {
		return name;
	}
	public ArrayList<Double> getTransactions(){
		return transactions;
	}
	public void addTransactions(double amount) {
			transactions.add(amount);}
	

}

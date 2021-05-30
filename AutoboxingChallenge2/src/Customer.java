import java.util.ArrayList;

public class Customer {
	private String name;
	private ArrayList<Double> transactions;
	
	public Customer(String name,double initialAmount) {
		super();
		this.name = name;
		this.transactions = new ArrayList<>();
		addTransaction(initialAmount);//handling initial amount and subsequent amount simultaneously
	}
	
	public String getName() {
		return name;
	}

	public ArrayList<Double> getTransactions() {
		return transactions;
	}
	public void addTransaction(double amount) {
		this.transactions.add(amount);//Integer.valueOf(amount),autoboxing
	}
	
	
	

}

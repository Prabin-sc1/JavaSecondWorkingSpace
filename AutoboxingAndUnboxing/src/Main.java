
public class Main {

	public static void main(String[] args) {
		Bank bank=new Bank("NRBB");
		
		
		bank.addBranch("Janakpur");
		bank.addCustomer("Janakpur", "Ram", 135.25);
		bank.addCustomer("Janakpur", "Rama", 155.25);
		bank.addCustomer("Janakpur", "Ramay", 125.25);
		bank.addCustomer("Janakpur", "Ramaya", 335.25);
		bank.addCustomer("Janakpur", "Ramayan", 235.25);
		
		bank.addBranch("Dhanusha");
		bank.addCustomer("Dhanusha", "Ram", 135.25);
		bank.addCustomer("Dhanusha", "Rama", 155.25);
		bank.addCustomer("Dhanusha", "Ramay", 125.25);
		bank.addCustomer("Dhanusha", "Ramaya", 335.25);
		bank.addCustomer("Dhanusha", "Ramayan", 235.25);
		
		bank.addCustomerTransactions("Janakpur", "Ram", 2);
		bank.addCustomerTransactions("Janakpur", "Ram", 22);
		bank.addCustomerTransactions("Janakpur", "Ramay", 24.2);


		
		bank.listCustomers("Janakpur",true);
	}

}

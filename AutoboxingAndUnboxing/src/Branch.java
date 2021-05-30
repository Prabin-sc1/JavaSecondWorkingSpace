import java.util.ArrayList;

public class Branch {
	private String name;
	private ArrayList<Customer> customerList;
	
	public Branch(String name) {
		this.name=name;
		this.customerList=new ArrayList<>();
	}
	
	
	public String getName() {
		return name;
	}


	public ArrayList<Customer> getCustomerList() {
		return customerList;
	}


	public boolean addCustomer(String customerName,double initialAmount) {
		if(findCustomer(customerName)!=null) {
			System.out.println("already on file");
		     return false;
		}
		this.customerList.add(new Customer(customerName,initialAmount));
		return true;
	}
	
	public boolean addCustomerTransactions(String customerName,double amount) {
		Customer existingCustomer=findCustomer(customerName);
		if(existingCustomer!=null) {
			existingCustomer.addTransactions(amount);
			return true;
			
		}
		return false;
	}
	
	private  Customer findCustomer(String name) {
		for(int i=0;i<customerList.size();i++) {
			Customer checkedCustomer=this.customerList.get(i);
			if(checkedCustomer.getName().equals(name)) {
				return checkedCustomer;
			}
		}
		return null;
	}
	
	
	

}

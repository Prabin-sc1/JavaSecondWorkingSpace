import java.util.ArrayList;

public class Branch {
	private String branchName;
	private ArrayList<Customer> customerList;

	public Branch(String name) {
		this.branchName = name;
		this.customerList = new ArrayList<>();
	}

	public String getBranchName() {
		return branchName;
	}
	

	public ArrayList<Customer> getCustomerList() {
		return customerList;
	}

	public boolean addNewCustomer(String customerName,double initialAmount) {
		if(findCustomer(customerName)==null) {
			this.customerList.add(new Customer(customerName,initialAmount));
			return true;
		}
		return false;
	}
	public boolean addCustomerTransaction(String branchName, String customerName,double amount) {
		Customer existingCustomer=findCustomer(customerName);
		if(existingCustomer!=null) {
	     existingCustomer.addTransaction(amount);
	     return true;
		}
		return false;
	}
	private Customer findCustomer(String customerName) {
		for(int i=0;i<customerList.size();i++) {
			Customer checkedCustomer=this.customerList.get(i);
			if(checkedCustomer.getName().equals(customerName)) {
				return checkedCustomer;
			}
		}
		return null;
		
	}

    
//   public int findCustomer(Customer customer) {
//	   return this.customerList.indexOf(customer);
//			  }
//   public int findCustomer(String name) {
//	   for(int i=0;i<customerList.size();i++) {
//		   Customer customer=new Customer(name);
//		   if(customer.getName()!=null) {
//			   return this.customerList.indexOf(customer);
//		   }
//		  
//	   }
//	   return -1;
//   }

}

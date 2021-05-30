import java.util.ArrayList;

public class Bank {
	private String bankName;
	private ArrayList<Branch> branchList;

	public Bank(String name) {
		this.bankName = name;
		branchList = new ArrayList<>();
	}

	public boolean addBranch(String branchName) {
		if (findBranch(branchName) == null) {
			this.branchList.add(new Branch(branchName));
			return true;
		}
		return false;
	}

	public boolean addCustomer(String branchName, String customerName, double initialAmount) {
		Branch existingBranch = findBranch(branchName);
		if (existingBranch != null) {
			return existingBranch.addNewCustomer(customerName, initialAmount);
		}
		return false;

	}

	public boolean addCustomerTrasaction(String branchName, String customerName, double amount) {
		Branch existingBranch = findBranch(branchName);
		if (existingBranch != null) {
			return existingBranch.addCustomerTransaction(branchName, customerName, amount);
		}
		return false;
	}

	private Branch findBranch(String branchName) {
		for (int i = 0; i < branchList.size(); i++) {
			Branch checkedBranch = this.branchList.get(i);
			if (checkedBranch.getBranchName().equals(branchName)) {
				return checkedBranch;
			}

		}
		return null;
	}

	// lecturer mentioning below code was considering as meaty part of this code.
	public boolean listCustomer(String branchName,boolean showTransactions) {
		Branch existingBranch = findBranch(branchName);
		if (existingBranch != null) {
			System.out.println("Customer details for branch " + existingBranch.getBranchName());
			ArrayList<Customer> branchCustomers = existingBranch.getCustomerList();
			for (int i = 0; i < branchCustomers.size(); i++) {
				Customer branchCustomer = branchCustomers.get(i);
				System.out.println("Customer: " + branchCustomer.getName() + "[" + (i+1) + "]");
				if(showTransactions) {
					System.out.println("Transactions:");
					ArrayList<Double> transactions=branchCustomer.getTransactions();
					for(int j=0;j<transactions.size();j++) {
						System.out.println("["+(j+1)+"] Amount "+transactions.get(j));//doubleValue(j),unboxing
						
					}
				}
			}
			return true;
			
		}else {
			return false;
		}
	}

}

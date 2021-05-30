
public class Main {

	public static void main(String[] args) {
		Bank bank=new Bank("Nepal Rastriya Banijiya Bank");
        if(bank.addBranch("Janakpur")) {
        	System.out.println("Janakpur branch created");
        }
        bank.addCustomer("Janakpur","Prabin",1000.00);
        bank.addCustomer("Janakpur","Rabin",100.49);
        bank.addCustomer("Janakpur","Prabina",900.89);
        bank.addCustomer("Janakpur","Pankaj",200.23);
       
        bank.addBranch("Thapathali");
        bank.addCustomer("Thapathali","Arun",100.00);
        bank.addCustomer("Thapathali","Subhash",300.00);
        bank.addCustomer("Thapathali","Rman",400.04);
        bank.addCustomer("Thapathali","Shyam",60.40);
       
        bank.addCustomerTrasaction("Janakpur", "Prabin", 148.15);
        bank.addCustomerTrasaction("Janakpur", "Prabin", 44.15);
        bank.addCustomerTrasaction("Janakpur", "Rabin", 54.15);
        
        bank.listCustomer("Janakpur", true);
        System.out.println();
        bank.listCustomer("Thapathali", true);
        System.out.println();
        
        bank.addBranch("Sukute");
        if(!bank.addCustomer("Sukute", "sahil", 45.51)) {
        	System.out.println("error sukute branch doesn't exist.");
        }
        if(!bank.addBranch("Janakpur")) {
        	System.out.println("Janakpur branch already exists");
        }
        System.out.println();
        if(!bank.addCustomerTrasaction("Janakpur", "rami", 47.15)) {
        	System.out.println("Customer doesn't exists at branch");
        }
        System.out.println();
        if(!bank.addCustomer("Janakpur", "Prabin", 77)) {
        	System.out.println("Customer Prabin already exist");
        }
	}

}

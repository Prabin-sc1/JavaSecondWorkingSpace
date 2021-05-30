import java.util.ArrayList;

public class MobilePhone {
	private String myNumber;
	private ArrayList<Contacts> contactList;

	public MobilePhone(String myNumber) {
		this.myNumber=myNumber;
		this.contactList = new ArrayList<Contacts>();
	}
	public boolean addContact(Contacts contact) {
		if(findContact(contact.getName())>=0) {
			System.out.println("Contact is already in contact list.");
			return false;
		}
		contactList.add(contact);
		return true;
	}
	public void printAllContact() {
		System.out.println("You have "+contactList.size()+" contact in your contact list.");
		for(int i=0;i<contactList.size();i++) {
			System.out.println((i+1)+"."+this.contactList.get(i).getName()+"-->"+this.contactList.get(i).getPhoneNumber());
		}
	}
	
	//first we are going to find index this method, and after that we would overloaded that one.
	//so,be sure to make it private
	private int findContact(Contacts contact) {
		return this.contactList.indexOf(contact);
		//just returning index of contact in contact list
		//that's why we make it private
	}
	private int findContact(String contactName) {
		for(int i=0;i<this.contactList.size();i++) {
			Contacts contact=this.contactList.get(i);
			//why we supposed to pass this.contactList.get(i) into object of Contacts i.e.contact
			//we must passed it into object of Contacts because getName() method can only called by 
			//making object of contacts
			
			if(contact.getName().equals(contactName)) {
				return i;
			}
		}
		return -1;
	}
	public String queryContact(Contacts contact) {
		if(findContact(contact)>=0) {
			return contact.getName();
			//in this method we are returning actual string 
		}return null;
	}
	public Contacts queryContact(String name) {
		int pos=findContact(name);
		if(pos>=0) {
			return this.contactList.get(pos);
		}
		return null;	
	}
	
	public boolean updateContact(Contacts oldContact,Contacts newContact) {
		int foundPosition=findContact(oldContact);
		if(foundPosition<0) {
			System.out.println(oldContact.getName()+" is not found in your contact list.");
			return false;
			
		}
		else if(findContact(newContact.getName())!=-1){
			System.out.println("Contact with name "+newContact.getName()+" was already on your contact list.");
		    return false;
		}
		this.contactList.set(foundPosition, newContact);
		System.out.println(oldContact.getName()+" was modified with "+newContact.getName());
		return true;
		
	}
	public boolean removeContact(Contacts contact) {
		int foundPosition=findContact(contact);
		if(foundPosition<0) {
			System.out.println(contact.getName()+" was not found in contact list.");
			return false;
		}
		this.contactList.remove(foundPosition);
		System.out.println(contact.getName()+" was deleted from contact list.");
		return true;
	}
	
	
	

}

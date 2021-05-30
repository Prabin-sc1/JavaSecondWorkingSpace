import java.util.ArrayList;

public class MobilePhone {
	ArrayList<Contacts> contactList;
	
//	
//	public boolean store(Contacts contact) {
//		if(findContact(contact.getName())>=0) {
//			System.out.println("Contact is already on fire.");
//			return false;
//		}
//		contactList.add(contact);
//	}
	
	
	public MobilePhone() {
		
		this.contactList =new ArrayList<Contacts>();
	}

	public void add(Contacts contact) {
		contactList.add(contact);
	}
	
	public void printList() {
		System.out.println("There is "+contactList.size()+" contact in your contact list.");
		for(int i=0;i<contactList.size();i++) {
			System.out.println(contactList.get(i));
		}
	}
	
	public void modify(Contacts oldContact,Contacts newContact) {
		int pos=query(oldContact);
		if(pos>=0){
			modify(pos,newContact);
		}
		
	}
	private void modify(int pos,Contacts contact) {
		contactList.set(pos, contact);
		
	}
	public void remove(Contacts contact) {
		int pos=query(contact);
		if(pos>=0) {
			remove(pos);
		}
		
		
		
	}
	public void remove(int pos) {
		//Contacts contact=contactList.get(pos);
		contactList.remove(pos);
	}
	private int query(Contacts contact) {
	return contactList.indexOf(contact);
		
	}
	public boolean findContact (String contactNumber) {
	
		
	}
	

}

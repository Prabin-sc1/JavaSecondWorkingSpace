import java.util.ArrayList;

public class MobilePhone {
	private ArrayList<Contact> contactList;

	public MobilePhone() {
		this.contactList = new ArrayList<>();
	}

	public ArrayList<Contact> getContactList() {
		return contactList;
	}

	public boolean addNewContact(Contact contact) {
		if (findContact(contact.getName()) >= 0) {
			System.out.println("Contact  was already in contact list.");
			return false;
		}
		contactList.add(contact);
		return true;
	}

	public void print() {
		System.out.println("You have " + this.contactList.size() + " contacts in your contact list.");
		for (int i = 0; i < this.contactList.size(); i++) {
			System.out.println((i + 1) + "." +"Name:"+this.contactList.get(i).getName() + "  Contact Number:"
					+ this.contactList.get(i).getPhoneNumber());
		}
	}

	public boolean update(Contact oldContact, Contact newContact) {
		int foundPosition = findContact(oldContact);
		if (foundPosition < 0) {
			System.out.println(oldContact.getName() + " was not found.");
			return false;
		} else if (findContact(newContact.getName()) != -1) {
			System.out.println("Contact with name " + newContact.getName() + " already in file.");
			return false;
		}
		this.contactList.set(foundPosition, newContact);
		System.out.println(oldContact.getName() + " was modified with " + newContact.getName());
		return true;
	}

	public boolean remove(Contact existingContact) {
		int foundPosition = findContact(existingContact);
		if (foundPosition < 0) {
			System.out.println(existingContact.getName() + " was not in the list.");
			return false;
		}
		this.contactList.remove(foundPosition);
		System.out.println(existingContact.getName() + " has now removed from contact list.");
		return true;
	}

	public String searchContact(Contact contact) {
		if (findContact(contact) >= 0) {
			return contact.getName();
		}
		return null;
	}

	public Contact searchContact(String name) {
		int pos = findContact(name);
		if (pos >= 0) {
			return this.contactList.get(pos);
		}
		return null;
	}

	private int findContact(Contact contact) {
		return this.contactList.indexOf(contact);
	}

	private int findContact(String name) {
		for (int i = 0; i < this.contactList.size(); i++) {
			Contact contact = this.contactList.get(i);
			if (contact.getName().equals(name)) {
				return i;
			}
		}
		return -1;
	}
}

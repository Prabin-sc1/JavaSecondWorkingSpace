import java.util.ArrayList;

public class GmailList {
	public ArrayList<Email> gmailList;

	public GmailList() {
		this.gmailList = new ArrayList<>();
	}

	public boolean add(Email email) {
		if (findGmail(email.getEmail()) >= 0) {
			//System.out.println("email was already on file.");
			return false;
		}
		this.gmailList.add(email);
		return true;
	}

	public void print() {
		System.out.println("You have " + gmailList.size() + " email on file.");
		for (int i = 0; i < gmailList.size(); i++) {
			System.out.println((i+1)+"."+"Name:" + gmailList.get(i).getName() + "   Email:" + gmailList.get(i).getEmail());
		}
	}
	public boolean modify(Email oldEmail,Email newEmail) {
		int pos=findGmail(oldEmail);
		if(pos<0) {
			System.out.println(oldEmail.getEmail()+" was not in gmail list");return false;
		}
		else if(findGmail(newEmail.getEmail())!=-1) {
			System.out.println(newEmail.getEmail()+" was already in gmail list");
			return false;
		}
		this.gmailList.set(pos, newEmail);
	//	System.out.println(oldEmail.getEmail()+" was modified with "+newEmail.getEmail());
		return true;
	}
	public boolean remove(Email existingEmail) {
		int pos=findGmail(existingEmail);
		if(pos<0) {
			System.out.println(existingEmail.getEmail()+" was not in gmail list");
			return false;
		}
		this.gmailList.remove(pos);
		System.out.println(existingEmail.getEmail()+" was removed successfully");
		return true;
		
	}
	public String queryGmail(Email email) {
		if(findGmail(email)>=0) {
			return email.getName();
		}
		return null;
	}
	public Email queryGmail(String emailString) {
		int pos=findGmail(emailString);
		if(pos>=0) {
			return this.gmailList.get(pos);
		}
		return null;
		
	}

	private int findGmail(Email email) {
		return this.gmailList.indexOf(email);
	}

	private int findGmail(String emailString) {
		for(int i=0;i<this.gmailList.size();i++) {
			Email email=this.gmailList.get(i);
			if(email.getEmail().equals(emailString)) {
				return i;
			}
		}
		return -1;
	}
	
}
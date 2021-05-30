import java.util.ArrayList;

public class FriendList {
	private ArrayList<String> friendList=new ArrayList<String>();
	
	

	public ArrayList<String> getFriendList() {
		return friendList;
	}
	public void add(String name) {
		friendList.add(name);
	}
	public void print() {
		System.out.println("You have "+friendList.size()+" friends in your friend list.");
		for(int i=0;i<friendList.size();i++) {
			System.out.println((i+1)+"."+friendList.get(i));
		}
	}
	public void modify(String name,String nextName) {
	  int pos=search(name);
	  if(pos>=0) {
		  
		  modify(pos,nextName);
	  }
		
	}
	private void modify(int pos,String anotherName) {
     friendList.set(pos, anotherName);
     //System.out.println((pos+1)+" was modified with "+anotherName);
	}
	public void remove(String name) {
		int pos=search(name);
		if(pos>=0) {
			remove(pos);
		}
		
	}
	private void remove(int pos) {
		friendList.remove(pos);
		//System.out.println((pos+1)+" was removed from list.");
	}
	public boolean find(String name) {
		int pos=search(name);
		if(pos>=0) {
			return true;
		}
		return false;
		
	}
	
	private int search(String name) {
		return friendList.indexOf(name);
		
	}

}

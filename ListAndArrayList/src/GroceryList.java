import java.util.ArrayList;

public class GroceryList {
	private ArrayList<String> groceryList=new ArrayList<String>();
	
	public void addItem(String item) {
    groceryList.add(item);		
	}
	public void printItem() {
		System.out.println("You have "+groceryList.size()+" items in your grocery list.");
		for(int i=0;i<groceryList.size();i++) {
			System.out.println((i+1)+". "+groceryList.get(i));
		}
	}
	public void modifyItem(String currentItem,String newItem) {
		int position=query(currentItem);
		if(position>=0) {
			modifyItem(position,newItem);
		}
		
		
	}
	private void modifyItem(int pos,String newItem) {
		groceryList.set(pos, newItem);
		System.out.println("Grocery item "+(pos+1)+" has been modified.");
	}
	
	public void removeItem(String item) {
		int position=query(item);
		if(position>=0) {
			removeItem(position);
		}
		
	}
	
	private void removeItem(int pos) {
		
		groceryList.remove(pos);
		System.out.println("Grocery item "+(pos+1)+" was removed from grocery list.");
	}
	
	private int  query(String item) {
		return groceryList.indexOf(item);
	
	}

	public boolean onFile(String searchItem) {
		int pos=query(searchItem);
		if(pos>=0) {
			return true;
		}
		return false;
	}
	public ArrayList<String> getGroceryList() {
		return groceryList;
	}
	
	
	

}



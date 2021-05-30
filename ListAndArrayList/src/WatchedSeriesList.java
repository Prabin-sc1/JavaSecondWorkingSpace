import java.util.ArrayList;

public class WatchedSeriesList {
	private ArrayList<String> list = new ArrayList<>();

	public void add(String name) {
		list.add(name);
	}

	public void printList() {
		System.out.println("You have " + list.size() + " series in your watched list.");
		for (int i = 0; i < list.size(); i++) {
		System.out.println((i+1)+"."+list.get(i));

		}
	}

	public void modify(String currentSeries,String anotherSeries ) {
		int pos=search(currentSeries);
		if(pos>=0) {
			modify(pos,anotherSeries);
		}
	}
	
	private void modify(int position, String newItem) {
		list.set(position, newItem);

	}
    public void remove(String series) {
    	int pos=search(series);
    	if(pos>=0) {
    		remove(pos);
    	}
    	
    }
	private void remove(int position) {
		String series = list.get(position);
		list.remove(position);
	}

	public int  search(String name) {
		
	return list.indexOf(name);	
	}
	public boolean find(String name) {
		int pos=search(name);
		if(pos>=0) {
			return true;
		}
		return false;
			
		
		
	}

	public ArrayList<String> getList() {
		return list;
	}
	

}

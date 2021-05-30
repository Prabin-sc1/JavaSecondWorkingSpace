package linked.implementation.byTim;

public class Node extends ListItem {

	public Node(Object value) {
		super(value);
		
	}

	@Override
	ListItem next() {
		return this.rightLink;
	}

	@Override
	ListItem setNext(ListItem item) {
		this.rightLink=item;
		return rightLink;
	}

	@Override
	ListItem previous() {
		return this.leftLink;
	}

	@Override
	ListItem setPrevious(ListItem item) {
		this.leftLink=item;
		return this.leftLink;
	}

	@Override
	int compareTo(ListItem item) {    //return -1 if the item parameter should sort before the object.Otherwise,we're gonna return 1,if that's not the case return 0 if they're considered to be equal
		if(item != null) {
			return ((String) super.getValue()).compareTo((String)item.getValue());
		}
		return -1; //because it's null and therefore has to be in that sort order.Negative bacause any value is gonna be greater than null,effectively
	}
	

}

package linked.implementation.byTim;
//Node -->info|next
//value
public abstract class ListItem {
	protected ListItem rightLink=null;
	protected ListItem leftLink=null;            //creating instance of this very same class within a class
	
	protected Object value;
	//any concrete class that inherits from list will need constructor that sets value
	public ListItem(Object value) {
		this.value=value;
	}
	public Object getValue() {
		return value;
	}
	public void setValue(Object value) {
		this.value=value;
	}
	
	//below code done because linked list follow DLL which is very common to perform any operation such as add,remove,traverse,etc
	//so abstract may be suitable for this
	//almost any data structure perform below operation while doing CRUD activities
	abstract ListItem next();        //next returns a reference to the next ListItem in list
	abstract ListItem setNext(ListItem item); //and setNext where we're passing the parameter list items sets to the reference to the next item to
	//refer to in the parameter,which is ofcourse item
	
	abstract ListItem previous();
	abstract ListItem setPrevious(ListItem item);
	
	 abstract int compareTo(ListItem item); // comapares an object to the item whatever has been passed through the parameter and returned zero with or equal,
	// and also returns a number if the item parameter sort before the object,which would be negative.Otherwise it is gonna return a positive number.
}
//Note:keep in mind abstract methods defined,what must be implemented by any concrete class it inherits from,this class.

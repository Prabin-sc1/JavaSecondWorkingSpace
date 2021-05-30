//below code done bacause any that structure using a node objects will implement.
package linked.implementation.byTim;

public interface NodeList {
	ListItem getRoot();   //ant data structure have root or head
	boolean add(ListItem item);
	boolean remove(ListItem item);
	void traverse(ListItem root);
	

}

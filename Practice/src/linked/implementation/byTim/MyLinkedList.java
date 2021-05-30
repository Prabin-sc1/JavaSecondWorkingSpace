package linked.implementation.byTim;

public class MyLinkedList implements NodeList {
	private ListItem root = null;

	public MyLinkedList(ListItem root) {
		super();
		this.root = root;
	}

	@Override
	public ListItem getRoot() {

		return this.root;
	}

	@Override
	public boolean add(ListItem newItem) {
		if (this.root == null) { // list was empty, so this item becomes the head of the list]
			this.root = newItem;
			return true;
		}
		ListItem currentItem = this.root;
		while (currentItem != null) { // checking each item
			int comparison = currentItem.compareTo(newItem);
			if (comparison < 0) {
				// newItem is greater, so move right if possible
				if (currentItem.next() != null) { // going forward
					currentItem = currentItem.next();
				} else {
					// there is no next, so insert at end of list
					currentItem.setNext(newItem);
					newItem.setPrevious(currentItem);
					return true;
				}
			} else if (comparison > 0) {
				// newItem is less, so move left i.e. insert before
				if (currentItem.previous() != null) { // going backward
					currentItem.previous().setNext(newItem); // given=null---d,f,h---null
																// b,d,f,h

					newItem.setPrevious(currentItem.previous()); // null---b,d,f,h---null

					newItem.setNext(currentItem);
					currentItem.setPrevious(newItem);
				} else {
					// the node with a previous is the root
					newItem.setNext(this.root);
					this.root.setPrevious(newItem);
					this.root = newItem;
				}
				return true;
			} else {
				// equal
				System.out.println(newItem.getValue() + " is already in list.");
				return false;
			}
		}
		return false;
	}

	@Override
	public boolean remove(ListItem item) {
             if(item != null) {
            	 System.out.println("Deleting item "+item.getValue());
             }
             ListItem currentItem=this.root;
             while(currentItem != null) {
            	 int comparison=currentItem.compareTo(item);
            	 if(comparison == 0) {
            		 //found item to delete
            		 if(currentItem == this.root) {
            			 this.root=currentItem.next();
            			 
            			 //till now we have had all set but not deleted
            			 //b , c , d
            		 }
            		 else {
            			 currentItem.previous().setNext(currentItem.next());
            			 if(currentItem.next() != null) {
            				 currentItem.next().setPrevious(currentItem.previous());
            				 
            				 
            			 }
            		 }
            		 return true;
            	 }else if(comparison < 0) {
            		 currentItem=currentItem.next();
            	 }else {  // >0
            		 // We are at an item greater than the one to be deleted
            		 //so item is not in the list
            		 return false;
            	 }
             }
             //We have reached the end of the list
             //without finding the item to delete
             return false;
	}

	@Override
	public void traverse(ListItem root) {
		if (this.root == null) {
			System.out.println("The list is empty.");
		} else {
			while (root != null) {
				System.out.println(root.getValue());
				root = root.next();

			}

		}

	}

}

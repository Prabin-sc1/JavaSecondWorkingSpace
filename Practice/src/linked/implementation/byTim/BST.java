package linked.implementation.byTim;

public class BST implements NodeList{
     private ListItem root=null;
     
     public BST(ListItem root) {
    	 this.root=root;
     }
	@Override
	public ListItem getRoot() {
		
		return this.root;
	}
// same as LL but instead of actually breaking and recreating links to insert, we're actually gonna keep traversing the actual tree itself.
	// recursive function=function call itself
	//BST is important part of DBMS
	@Override
	public boolean add(ListItem item) {
		
		return false;
	}

	@Override
	public boolean remove(ListItem item) {
		
		return false;
	}

	@Override
	public void traverse(ListItem root) {
		//recursive method
		if(root != null) {
			traverse(root.previous());  //I got amazed here because i found new awesome feature called recursive call.Ambiguiting
			System.out.println(root.getValue());
			traverse(root.next());
		}
		
	}
	

}

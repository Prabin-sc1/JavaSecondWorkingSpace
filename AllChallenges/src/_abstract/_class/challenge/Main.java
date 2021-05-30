package _abstract._class.challenge;

public class Main {
	public static void main(String[] args) {

		MyLinkedList ll = new MyLinkedList(null);
		ll.traverse(ll.getRoot());
		
		String stringData = "5 7 9 3 8 9 2 3 9 0 4 6 1";
		String[] data = stringData.split(" ");
		for (String s : data) {
			ll.addItem(new Node(s));

		}
		ll.traverse(ll.getRoot());
		
		ll.removeItem(new Node("3"));
		ll.traverse(ll.getRoot());      
		ll.removeItem(new Node("4"));
		ll.removeItem(new Node("1"));
		ll.removeItem(new Node("9"));
		ll.traverse(ll.getRoot());
		ll.removeItem(new Node("0"));
		ll.removeItem(new Node("2"));
		ll.removeItem(new Node("8"));
		ll.traverse(ll.getRoot());
		ll.removeItem(new Node("6"));
		ll.removeItem(new Node("5"));
		ll.removeItem(new Node("7"));
		ll.traverse(ll.getRoot());

		ll.removeItem(new Node("3"));
		ll.traverse(ll.getRoot());      
		ll.removeItem(new Node("4"));
		ll.removeItem(new Node("1"));
		ll.removeItem(new Node("9"));
		ll.traverse(ll.getRoot());
		ll.removeItem(new Node("0"));
		ll.removeItem(new Node("2"));
		ll.removeItem(new Node("8"));
		ll.traverse(ll.getRoot());
		ll.removeItem(new Node("6"));
		ll.removeItem(new Node("5"));
		ll.removeItem(new Node("7"));
		ll.traverse(ll.getRoot());
	}
}
//split return string array (read one string when delimiter came)
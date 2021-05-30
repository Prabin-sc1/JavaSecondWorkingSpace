package implementation;

public class Linked {
	Node head;
	void add(int data) {
		Node toAdd=new Node(data);
		if(head == null) {
			head=toAdd;
			return;
		}
		Node temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=toAdd;
	}
	void print() {
		Node temp=head;
		while(temp!=null) {
			System.out.println(temp.data+" ");
			temp=temp.next;
			
		}
	}
	
	static class Node{
		int data;
		Node next;
		public Node(int d) {
			this.data=d;
			next=null;
		}
	}

}

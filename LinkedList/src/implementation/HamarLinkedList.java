package implementation;

public class HamarLinkedList<T> {
	Node<T> head;

	void add(T data) {
		Node<T> toAdd = new Node<T>(data);

		if (head == null) {
			head = toAdd;
			return;
		}
		Node<T> temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = toAdd;
	}

	void print() {
		Node<T> temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}

	static class Node<T> { // why static ?because you can access it outside from this class
		T data;
		Node<T> next;

		public Node(T data) {
			this.data = data;
			next = null;
		}
	}
}

public class CircularLinkedList {
	private Node first = null;
	private Node last = null;
	
	public void insertFirst(int data) {
		Node newNode = new Node();
		newNode.data = data;
		if(first == null) {
			first = newNode;
			last = newNode;
		}
		else {
			newNode.next = first;
			first = newNode;
		}
	}
	public void insertLast(int data) {
		Node newNode = new Node();
		newNode.data = data;
		if(first == null) {
			first = newNode;
			last = newNode;
		}
		else {
			last.next = newNode;
			last = newNode;
		}
	}
	public Node deleteFirst() {
		Node temp = first;
		if(first == null) {
			System.out.println("Empty list");
		}
		else {
			first = first.next;
		}
		return temp;
	}
	public void displayList() {
		if(first == null)
			System.out.println("List empty");
		Node current = first;
		while(current != null) {
			System.out.println("{ " + current.data + " }");
			current = current.next;
		}
	}
}
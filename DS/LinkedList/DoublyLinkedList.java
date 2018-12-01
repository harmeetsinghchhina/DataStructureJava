public class DoublyLinkedList {
	private Node first;
	private Node last;
	
	public void insertFirst(int data) {
		Node newNode = new Node();
		newNode.data = data;
		if(first == null) {
			last = newNode;
		}
		else {
			newNode.next = first;
			first.prev = newNode;
		}
		newNode.prev = null;
		first = newNode;
	}
	public void insertLast(int data) {
		Node newNode = new Node();
		newNode.data = data;
		if(first == null) {
			first = newNode;
		}
		else {
			last.next = newNode;
			newNode.prev = last;
		}
		last = newNode;
	}
	public Node deleteFirst() {
		Node temp = first;
		if(first == null) {
			System.out.println("Empty List");
		}
		else if(first.next == null) {
				first = null;
				last = null;
			}
			else {
				first = first.next;
				first.prev = null;
			}
		return temp;
	}
	public Node deleteLast() {
		Node temp = last;
		if(last == null) {
			System.out.println("Empty List");
		}
		else if(last.prev == null) {
				first = null;
				last = null;
			}
			else {
				last = last.prev;
				last.next = null;
			}
		return temp;
	}
	public void displayListNext() {
		Node current = first;
		while(current != null) {
			System.out.println("{ " + current.data + " }");
			current = current.next;
		}
	}
	public void displayListPrev() {
		Node current = last;
		while(current != null) {
			System.out.println( "{ " + current.data + " }");
			current = current.prev;
		}
	}
}
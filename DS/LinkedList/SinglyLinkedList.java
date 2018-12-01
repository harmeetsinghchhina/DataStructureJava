public class SinglyLinkedList {
	private Node first = null;
	
	public void insertFirst(int data) {
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = first;
		first = newNode;
	}
	public void insertLast(int data) {
		Node newNode = new Node();
		newNode.data = data;
		Node current = first;
		if(first == null) {
			first = newNode;
		}
		else {
			while(current.next != null) {
				current = current.next;
			}
			current.next = newNode;
		}
	}
	public Node deleteFirst() {
		Node temp = first;
		if(first == null)
			System.out.println("Empty List");
		first = first.next;
		return temp;
	}
	public Node deleteLast() {
		Node current = first;
		Node temp = null;
		if(first == null) {
			System.out.println("Empty List");
		}
		else if(first.next == null) {
				temp = first;
				first = null;
		}
		else {
			while(current.next.next != null) {
				current = current.next;
			}
			temp = current.next;
			current.next = null;
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
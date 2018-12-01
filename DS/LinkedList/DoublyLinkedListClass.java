public class DoublyLinkedListClass {
	public static void main(String[] args) {
		DoublyLinkedList dl = new DoublyLinkedList();
		dl.insertFirst(5);
		dl.insertFirst(4);
		dl.insertFirst(3);
		dl.insertFirst(2);
		dl.insertLast(6);
		System.out.println();
		dl.displayListNext();
		dl.deleteFirst();
		System.out.println();
		dl.displayListNext();
		System.out.println();
		dl.displayListPrev();
		dl.deleteLast();
		System.out.println();
		dl.displayListNext();
		System.out.println();
		dl.displayListPrev();
	}
}
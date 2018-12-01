public class SinglyLinkedListClass {
	public static void  main(String[] args) {
		SinglyLinkedList list = new SinglyLinkedList();
		list.insertFirst(10);
		list.insertFirst(9);
		list.insertFirst(8);
		list.insertFirst(7);
		list.displayList();
		list.deleteFirst();
		list.displayList();
		list.deleteLast();
		list.displayList();
		list.insertLast(10);
		list.displayList();
	}
}
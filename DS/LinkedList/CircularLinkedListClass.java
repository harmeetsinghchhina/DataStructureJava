public class CircularLinkedListClass {
	public static void  main(String[] args) {
		CircularLinkedList list = new CircularLinkedList();
		list.insertFirst(10);
		list.insertFirst(9);
		list.insertFirst(8);
		list.insertFirst(7);
		list.displayList();
		list.deleteFirst();
		list.displayList();
	}
}
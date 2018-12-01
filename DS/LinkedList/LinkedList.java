public class LinkedList {
	public static void  main(String[] args) {
		Node nodeA = new Node();
		Node nodeB = new Node();
		Node nodeC = new Node();
		Node nodeD = new Node();
		nodeA.next = nodeB;
		nodeB.next = nodeC;
		nodeC.next = nodeD;
		System.out.println(ListLength(nodeA));
	}
	public static int ListLength(Node n) {
		int length = 0;
		while(n != null) {
			length++;
			n = n.next;
		}
		return length;
	}
}
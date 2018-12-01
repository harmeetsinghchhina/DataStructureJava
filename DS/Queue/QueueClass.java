public class QueueClass {
	public static void main(String[] args) {
		Queue qu = new Queue(5);
		qu.insert(5);
		qu.insert(8);
		qu.insert(13);
		qu.insert(14);
		qu.insert(15);
		System.out.println("Peek front ele value " + qu.peekFront());
		System.out.println("Rear index of queue " + qu.rear());
		System.out.println("Ele removed " + qu.remove());
		System.out.println("Ele removed " + qu.remove());
		qu.insert(17);
		qu.insert(20);
		System.out.println("Peek front ele value " + qu.peekFront());
		System.out.println("Rear index of queue " + qu.rear());
		System.out.println("Queue values ");
		qu.print();
	}
}
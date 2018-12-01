public class Queue {
	private int capacity = 0;
	private long queueArray[];
	private int front;
	private int rear;
	private int nitems = 0;
	
	public Queue(int size) {
		this.capacity = size;
		this.queueArray = new long[capacity];
		this.front = -1;
		this.rear = -1;
	}
	public void insert(long value) {
		if((front == 0 && rear == capacity-1) || rear == (front-1)%(capacity-1)){
			System.out.println("Queue Full");
		}
		else if(front == -1) {
			front = rear = 0;
			queueArray[rear] = value;
			nitems++;
		}
		else if( rear == capacity-1 && front != 0) {
			rear = 0;
			queueArray[rear] = value;
		}
		else {
			rear++;
			queueArray[rear] = value;
		}
	}
	
	public long remove() {
		long temp = queueArray[front];
		if(front == -1) {
			System.out.println("Queue empty");
			return -1;
		}
		queueArray[front] = -1;//Since this is empty now
		
		if(front == rear) {
			front = rear =-1;
		}
		else if(front == capacity-1) {
			front = 0;
		}
		else {
			front++;
		}
		return temp;
	}
	public void print() {
		if(front == -1) {
			System.out.println("Queue empty");
		}
		if(rear >= front) {
			for(int i=front; i<=rear; i++)
				System.out.println(queueArray[i]);
		}
		else {
			for(int i=front; i<=capacity-1; i++)
				System.out.println(queueArray[i]);
			for(int i=0; i<=rear; i++)
				System.out.println(queueArray[i]);
		}
	}
			
	public long peekFront() {
		return queueArray[front];
	}
	public long rear() {
		return rear;
	}
	public boolean isEmpty() {
		return nitems == 0;
	}
	public boolean isFull() {
		return nitems == capacity;
	}
}
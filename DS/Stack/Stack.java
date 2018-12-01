public class Stack {
	private int capacity;
	private char[] stackArray;
	private int top = -1;
	
	public Stack(int size) {
		this.capacity = size;
		this.stackArray = new char[capacity];
	}
	public void push(char value) {
		if(!isFull()) {
			top++;
			stackArray[top] = value;
		}
		else
			System.out.println("Stack Full");
	}
	public char pop() {
		if(!isEmpty()) {
			int old_top = top;
			top--;
			return stackArray[old_top];
		}
		else
			System.out.println("Stack Empty");
			return '0';
	}
	public char peek() {
		return stackArray[top];
	}
	public boolean isEmpty() {
		return (top == -1);
	}
	public boolean isFull() {
		return (top == capacity-1);
	}
}
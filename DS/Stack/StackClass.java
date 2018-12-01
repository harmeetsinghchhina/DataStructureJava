public class StackClass {
	public static void main(String[] args) {
		Stack st = new Stack(2);
		st.isEmpty();
		st.push('a');
		st.push('b');
		st.push('c');
		st.peek();
		st.isEmpty();
		while(!st.isEmpty())
			System.out.println(st.pop());
		String str = "hello";
		reverseString(str);
	}
	public static void reverseString(String str) {
		Stack st1 = new Stack(str.length());
		for( int i=0; i<str.length(); i++) {
			st1.push(str.charAt(i));
		}
		while( !st1.isEmpty()) {
			System.out.println(st1.pop());
		}
	}
}
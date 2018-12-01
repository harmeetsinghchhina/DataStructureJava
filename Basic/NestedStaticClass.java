class OuterClass {
	private int a;
	private static int b;
	private static void show() {
		System.out.println("Outer Show");
	}
	static class InnerClass {
		static void print() {
			System.out.println("Inner Print");
			show();
		}
		void display() {
			System.out.println("Inner Display");
		}
	}
}
public class NestedStaticClass {
	public static void main(String[] args) {
		OuterClass.InnerClass oi = new OuterClass.InnerClass();
		oi.display();
		OuterClass.InnerClass.print();
	}
}
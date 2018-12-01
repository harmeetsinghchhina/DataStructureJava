class OuterClass {
	public int a;
	private static int b;
	static int c;
	int d;
	void show1() {
		System.out.println("Outer Show");
	}
	static void show2() {
		System.out.println("Outer static show()");
	}
	private void show3() {
		System.out.println("Outer private show()");
	}
	class InnerClass {
		private int e;
		void print1() {
			System.out.println("Inner print()");
		}
	}
}
public class NestedInnerClass {
	public static void main(String[] args) {
		OuterClass oc = new OuterClass();
		OuterClass.show2();
		OuterClass.InnerClass oi = oc.new InnerClass();
		oi.print1();
		System.out.println(oi.a);
	}
}
		
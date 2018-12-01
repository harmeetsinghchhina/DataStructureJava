interface A {
	void show();
	interface B {
		void print();
	}
}
class C implements A.B {
	public void print() {
		System.out.println("print");
	}
	protected interface D {
		void show();
	}
}
class D implements C.D {
	public void show() {
		System.out.println("show");
	}
}
public class NestedInterface {
	public static void main(String[] args) {
		C c = new C();
		c.print();
		D d = new D();
		d.show();
	}
}
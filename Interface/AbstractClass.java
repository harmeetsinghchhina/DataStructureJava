abstract class A {
	int i=0;
	abstract void show();
}
class B extends A {
	void show() {
		System.out.println("B show()");
	}
}
public class AbstractClass {
	public static void main(String[] args) {
		A a = new B();
		a.show();
	}
}	
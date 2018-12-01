class A implements Cloneable {
	int x;
	String s;
	public A(int x, String s) {
		this.x = x; this.s = s;
	}
	@Override
	protected Object clone()
	throws CloneNotSupportedException {
		return super.clone();
	}
}
public class CloneableInterface {
	public static void main(String[] args) throws CloneNotSupportedException {
		A a = new A(5, "Hi");
		A b = (A)a.clone();
		System.out.println(b.s);
	}
}
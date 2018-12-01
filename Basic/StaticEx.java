class Outer {
	static int a=6;
public static class Static {
	int x;
	void print() {
		System.out.println(a);
	}
}
}
public class StaticEx {
	public static void main(String[] args)
	{
		Outer.Static o1 = new Outer.Static();
		o1.print();
	}
}
		
	
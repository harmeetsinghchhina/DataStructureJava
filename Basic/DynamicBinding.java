public class DynamicBinding {
	public static class SuperClass
	{
		void print()
		{System.out.println("SuperClass");}
	}
	public static class SubClass extends SuperClass
	{
		void print()
		{System.out.println("SubClass");}
	}
	public static void main(String[] args)
	{
		SuperClass A = new SuperClass();
		A.print();
		SuperClass B = new SubClass();
		B.print();
	}
}
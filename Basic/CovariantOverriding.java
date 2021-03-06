class A {}
class B extends A {}
class Base {
	A fun() {
		System.out.println("Base fun()");
		return new A();
	}
}
class Derived extends Base {
	B fun() {
		System.out.println("Derived fun()");
		return new B();
	}
}
class CovariantOverriding {
	public static void main(String[] args)
	{
		Base base = new Base();
		base.fun();
		Derived derived = new Derived();
		derived.fun();
		Base b1 = new Derived();
		b1.fun();
	}
}
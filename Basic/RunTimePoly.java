class Parent {
	void show() {
	System.out.println("Show Parent");
	}
}
class Child extends Parent {
	@Override
	void show() {
	System.out.println("Show Child");
	}
}
class RunTimePoly {
	public static void main(String[] args) {
	Parent P1 = new Parent();
	P1.show();
	Parent P2 = new Child();
	P2.show();
	}
}
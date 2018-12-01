class Parent {
	int value=1;
	Parent(){
	System.out.println("Parent");}
}
class Child extends Parent {
	int value=100;
	Child(){
	System.out.println("Child");}
}
public class DataMemberInheritance {
	public static void main(String[] args) {
		Child c = new Child();
		System.out.println(c.value);
		Parent p = c;
		System.out.println(p.value);
	}
}
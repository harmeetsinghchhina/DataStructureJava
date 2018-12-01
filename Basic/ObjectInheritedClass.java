class Super {
	Super(){
	System.out.println(this.getClass().getName());}
}
class Child extends Super {
	Child(){
	System.out.println(this.getClass().getName());}
}
public class ObjectInheritedClass {
	public static void main(String[] args)
	{
		Child c = new Child();
	}
}
class Base {
	private int value;
	Base(int i){
	this.value = i;}
	void printValue(){
	System.out.println(this.value);}
}
class Derived extends Base{
	private int num;
	Derived(int i, int x){
	super(i);
	this.num= x;}
	void printNum(){
	System.out.println(this.num);}
}
public class Inheritance {
	public static void main(String[] args){
		Derived d = new Derived(5,10);
		d.printValue();
		d.printNum();
	}
}
import java.lang.Cloneable;
class newExample {
	public String name = "Created with new()";
};
class newInstanceExample {
	public String name = "Created with instanceOf()";
};
class cloneExample implements Cloneable {
	protected Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
	public String name = "Created with clone()";
};
class deserialization {
	public String name = "Created with descerialization";
	};
class ObjectCreation {
	public static void main(String[] args)
	{
		newExample obj1 = new newExample();
		System.out.println(obj1.name);
		try
		{
			Class cls = Class.forName("newInstanceExample");
			newInstanceExample obj2 = (newInstanceExample)cls.newInstance();
			System.out.println(obj2.name);
		}
		catch(Exception e){}
		cloneExample obj3 = new cloneExample();
		try
		{
			cloneExample obj4 = (cloneExample)obj3.clone();
			System.out.println(obj4.name);
		}
		catch(Exception e){}
	}
}
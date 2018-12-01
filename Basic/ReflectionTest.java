import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
class Reflection {
	private String str = "hi";
	public Reflection(){
		str = "hello";
	}
	public void method1() {
		System.out.println("Method1");
	}
	public void method2() {
		System.out.println("Method2");
	}
	private void method3() {
		System.out.println("Method3");
	}
}
public class ReflectionTest {
	public static void main(String[] args) throws Exception {
		Reflection rt = new Reflection();
		Class cls = rt.getClass();
		System.out.println("Class name " + cls.getName());
		Constructor cnst = cls.getConstructor();
		System.out.println("Constructor name " + cnst.getName());
		Method[] methods = cls.getMethods();
		for (Method m: methods)
			System.out.println("Method name " + m.getName());
		Method mcall = cls.getDeclaredMethod("method1");
		mcall.invoke(rt);
	}
}
		
class car {
	int num;
	car(int n) {
		this.num=n;
		}
}
class ObjectSwap {
	
	public static void swap(car c1, car c2)
	{
		int temp = c1.num;
		c1.num = c2.num;
		c2.num = temp;
	}
	public static void  main(String[] args)
	{
		car obj1 = new car(1);
		car obj2 = new car(2);
		swap(obj1, obj2);
		System.out.println(obj1.num);
	}
}
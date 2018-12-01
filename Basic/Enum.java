enum Car
	{
		CARA(4), CARB(6),CARC(9);
		private int price;
		Car(int p)
		{
			price=p;
		}
		int getPrice()
		{
			return price;
		}
	}
public class Enum
{
	public static void main(String[] args)
	{
		for(Car c: Car.values())
		{
			System.out.println(c + " cost " + c.getPrice());
		}
	}
}
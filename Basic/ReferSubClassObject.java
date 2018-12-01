class Bike {
	int gear;
	int speed;
	public Bike(int g, int s){
		this.gear=g; this.speed=s;
	}
	void applybrake(){
		speed=speed-1;
	}
	void increase(){
		speed=speed+1;
	}
	public String toString(){
		return ("Gears" + this.gear + "Speed" + this.speed);
	}
}
class MotorBike extends Bike {
	int height;
	public MotorBike(int g, int s, int h){
		super(g,s);
		this.height=h;
	}
	void setHeight(){
		height=height+1;
	}
	public String toString(){
		return ("Gears:" + this.gear + " Speed:" + this.speed + " Height:" + this.height);
	}
}
public class ReferSubClassObject {
	public static void main(String[] args){
		Bike b = new MotorBike(1,100,10);
		System.out.println(b.toString());
		//System.out.println(b.height);
		MotorBike mb = new MotorBike(2,200,20);
		System.out.println(mb.toString());
	}
}
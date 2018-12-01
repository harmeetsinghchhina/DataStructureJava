public class VechileClass implements Vechile {
	@Override
	public void changeGear() {
		System.out.println("Overritten changeGear");
	}
	@Override
	public void start() {
		System.out.println("Overritten start");
	}
	@Override
	public void stop() {
		System.out.println("Overritten STOP");
	}
	public static void main(String[] args) {
		VechileClass vc = new VechileClass();
		vc.changeGear();
		vc.start();
		vc.stop();
		Vechile.print();
		System.out.println(vc.display());
	}
}
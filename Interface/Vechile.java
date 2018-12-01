public interface Vechile {
	void changeGear();
	void start();
	void stop();
	default int display() {
		return 1;
	}
	static void print() {
		System.out.println("Printing");
	}
}
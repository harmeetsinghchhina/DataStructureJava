import java.util.Scanner;
public class ScannerClass {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		char chr = scn.next().charAt(0);
		int in = scn.nextInt();
		long l = scn.nextLong();
		double d = scn.nextDouble();
		System.out.println(str + "-" + chr + "-" + in + "-" + l + "-" + d + "-");
	}
}

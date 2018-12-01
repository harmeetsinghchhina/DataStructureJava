public class FinalArray {
	public static void main(String args[]) {
		final int[] arr = {1,2,3,4};
		arr[0] = 5;
		int arr1[] = new int[5];
		arr = arr1;
	}
}
public class SelectionSort {
	public static void main(String[] args) {
		int[] arr = {65, 25, 12, 22, 11, 9};
		selectionSort(arr);
		show(arr);
	}
	public static void selectionSort(int[] arr) {
		int minIndex=-1;
		for(int i=0; i<arr.length; i++)
		{
			minIndex = i;
			for(int j=i; j<arr.length; j++)
				if(arr[j] < arr[minIndex])
					minIndex=j;
				
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
			show(arr);
		}
	}
	public static void show(int[] arr) {
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
}
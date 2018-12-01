public class BubbleSort {
	public static void main(String[] args) {
		int[] arr = {7, 9, 2, 5, 3};
		bubbleSort(arr);
		show(arr);
	}
	private static void bubbleSort(int[] arr)
	{	for(int i = 0; i<arr.length; i++)
		{
			for(int j=0; j<arr.length-i-1; j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1]=temp;
				}
				show(arr);
			}
		}
	}
	private static void show(int[] arr) {
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
}
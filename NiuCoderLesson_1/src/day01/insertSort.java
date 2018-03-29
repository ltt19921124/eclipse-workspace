package day01;

public class insertSort {
	
	
	public static void main(String[] args) {
		ArrayTools at = new ArrayTools();
		
		int[] arr = {4,7,1,2,14,15,16,17,3,5,6,8,9,10,11,12,13};
		ArrayTools.printArray(arr);
		System.out.println("=========================================");
		insertSort(arr);
		ArrayTools.printArray(arr);
		
		
	}

	public static void insertSort(int[] arr) {
		
		for (int i = 1; i < arr.length; i++) {
			for (int j = i - 1; j >= 0 && arr[j] > arr[j + 1]; j--) {
				ArrayTools.swap(arr, j, j + 1);
			}
		}
		
	}
}

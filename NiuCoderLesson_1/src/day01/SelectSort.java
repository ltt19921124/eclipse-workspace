package day01;

public class SelectSort {

	public static void main(String[] args) {
		
		int[] arr = {4,7,1,2,14,15,16,17,3,5,6,8,9,10,11,12,13};
		printArray(arr);
		System.out.println("=========================================");
		selectSort(arr);
		printArray(arr);
		
	}
	
	public static void selectSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					swap(arr, i, j);
				}
			}
		}
		
	}

	public static void swap(int[]arr,int i,int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static void printArray(int[] arr) {
		if (arr == null || arr.length < 2) {
			return;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	

}

package day01;
import day01.ArrayTools;
public class mergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {4,7,1,2,14,15,16,17,3,5,6,8,9,10,11,12,13};
		ArrayTools.printArray(arr);
		System.out.println("=========================================");
//		bubbleSort(arr);
		mergeSort(arr, 0, arr.length - 1);
		ArrayTools.printArray(arr);
	}
	
	public static void mergeSort(int[] arr) {
		if (arr == null || arr.length < 2) {
			return;
		}
		mergeSort(arr, 0, arr.length - 1);
	}
	
	public static void mergeSort(int[] arr, int l, int r) {
		if (l == r) {
			return;
		}
		int mid = l + ((r - l) >> 1);
		mergeSort(arr, l, mid);
		mergeSort(arr, mid + 1, r);
		merge(arr, l, mid, r);	
	}
	
	public static void merge(int[] arr, int l, int m, int r) {
		int[] help = new int[r - l + 1];
		int i = 0;
		int p1 = l;
		int p2 = m + 1;
		
		while (p1 <= m && p2 <= r) {
			help[i++] = arr[p1] < arr[p2] ? arr[p1++] : arr[p2++];
		}
		while (p2 <= r) {
			help[i++] = arr[p2++];
		}
		while (p1 <= m) {
			help[i++] = arr[p1++];
		}
		
		for (i = 0; i < help.length; i++) {
			arr[l + i] = help[i];
		}
		
	}

	public static int[] generateRandonArray(int maxSize,int maxValue) {
	
		int [] arr = new int[(int) ((maxSize + 1) * Math.random())];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) ((maxValue + 1) * Math.random());
		}
		
		return arr;
		
	}
	
	
}

package day01;

public class Sort {

	public static int getMax(int[] arr, int L, int R) {
		if (L == R) {
			return arr[L];
		}
		int mid = (L + R) / 2;
		int maxLeft = getMax(arr, L, mid);
		int mxRight = getMax(arr, mid + 1, R);
		return Math.max(maxLeft, mxRight);
	}
	
	public static void main(String[] args) {

		int[] arr = { 3, 5, 7, 8,9,23,90};
		System.out.println(getMax(arr, 0, arr.length - 1));
		
		
	}

}

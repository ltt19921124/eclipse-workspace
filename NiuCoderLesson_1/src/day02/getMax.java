package day02;

public class getMax {
	//test
	public static int getMax(int[] arr, int L, int R) {
		
		if (L == R) {
			return arr[L];
		}
		int mid = (L + R) / 2;
		int maxLeft = getMax(arr,L,mid);
		int maxRight = getMax(arr,mid + 1,R);
		
		return Math.max(maxLeft, maxRight);
	}
	
	//fibonacci
	public static int fiboNacci(int n) {
		if (n == 0 || n == 1) {
			return 1;
		} else {
			return fiboNacci(n - 1) + fiboNacci(n - 2);
		}
	}

	public static void main(String[] args) {

		int[] arr =  {1,2,3,490,5,6,7,8,90,9,10};
		int a = getMax(arr,0,arr.length - 1);
		
		System.out.println(a);
		
//		System.out.println(fiboNacci(6));
		
	}

	

}

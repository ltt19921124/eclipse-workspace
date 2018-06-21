package lesson5;

public class Ali {

	public static void main(String[] args) {
		
		System.out.println(ways(5,5,3,6));
		int[] arr = {1,1,3,2,8};
		System.out.println(getIndex(arr,8));
		
	}
	
	public static int getIndex (int[] arr,int key) {
		int min = 0;
		int max = arr.length - 1;
		int mid;
		while (min <= max) {
			mid = min + (max - min) / 2;
			if (arr[mid] > key) {
				max = mid - 1;
			}else if (arr[mid] < key) {
				min = mid + 1;
			}else {
				return mid;
			}
		}
		return -1;
	}
	
	public static int ways (int n, int m, int k, int p) {
		
		if (n < 2 || m < 1 || m > n || k < 1 || k > n) {
			return 0;
		}
		
		return process(n,k,m,p);
		
	}
	
	public static int process (int n,int k,int curPosition,int resStep) {
		if (resStep == 0) {
			return curPosition == k ? 1 : 0;
		}
		//resStep > 0
		if (curPosition == 1) {
			return process(n, k, curPosition + 1, resStep - 1);
		}
		if (curPosition == n) {
			return process(n, k, curPosition - 1, resStep - 1);
		}
		return process(n, k, curPosition + 1, resStep - 1 ) +
				process(n, k, curPosition - 1, resStep - 1);
		
	}

}










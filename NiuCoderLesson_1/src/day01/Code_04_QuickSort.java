package day01;

import java.util.Arrays;

public class Code_04_QuickSort {

	public static void quickSort(int[] arr) {
		if (arr == null || arr.length < 2) {
			return;
		}
		quickSort(arr, 0, arr.length - 1);
	}

	public static void quickSort(int[] arr, int L, int R) {
		if (L < R) {
			swap(arr, L + (int) (Math.random() * (R - L + 1)), R);
			int[] p = partition(arr, L, R);
			quickSort(arr, L, p[0] - 1);
			quickSort(arr, p[1] + 1, R);
		}
	}

	public static int[] partition(int[] arr, int L, int R) {
		int less = L - 1;
		int more = R;
		while (L < more) {
			if (arr[L] < arr[R]) {
				swap(arr, ++less, L++);
			} else if (arr[L] > arr[R]) {
				swap(arr, --more, L);
			} else {
				L++;
			}
		}
		swap(arr, more, R);
		return new int[] { less + 1, more };
	}

	public static void swap(int[] arr, int i, int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}

	// for test
	public static void comparator(int[] arr) {
		Arrays.sort(arr);
	}

	// for test
	public static int[] generateRandomArray(int maxSize, int maxValue) {
		int[] arr = new int[(int) ((maxSize + 1) * Math.random())];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) ((maxValue + 1) * Math.random()) - (int) (maxValue * Math.random());
		}
		return arr;
	}

	// for test
	public static int[] copyArray(int[] arr) {
		if (arr == null) {
			return null;
		}
		int[] res = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			res[i] = arr[i];
		}
		return res;
	}

	// for test
	public static boolean isEqual(int[] arr1, int[] arr2) {
		if ((arr1 == null && arr2 != null) || (arr1 != null && arr2 == null)) {
			return false;
		}
		if (arr1 == null && arr2 == null) {
			return true;
		}
		if (arr1.length != arr2.length) {
			return false;
		}
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] != arr2[i]) {
				return false;
			}
		}
		return true;
	}

	// for test
	public static void printArray(int[] arr) {
		if (arr == null) {
			return;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static void quick(int[] numbers)
	{
	    if(numbers.length > 0)   //查看数组是否为空
	    {
	    		quickSort_1(numbers, 0, numbers.length-1);
	    }
	}

	public static void quickSort_1(int[] numbers,int low,int high)
	{
	    if(low < high)
	    {
	    		int middle = getMiddle(numbers,low,high); //将numbers数组进行一分为二
	    		quickSort_1(numbers, low, middle-1);   //对低字段表进行递归排序
	    		quickSort_1(numbers, middle+1, high); //对高字段表进行递归排序
	    }
	    	
	}
	
	public static int getMiddle(int[] numbers, int low,int high)
	{
	    int temp = numbers[low]; //数组的第一个作为中轴
	    while(low < high)
	    {
	    while(low < high && numbers[high] >= temp)
	    {
	        high--;
	    }
	    numbers[low] = numbers[high];//比中轴小的记录移到低端
	    while(low < high && numbers[low] < temp)
	    {
	        low++;
	    }
	    numbers[high] = numbers[low] ; //比中轴大的记录移到高端
	    }
	    numbers[low] = temp ; //中轴记录到尾
	    return low ; // 返回中轴的位置
	}


	// for test
	public static void main(String[] args) {
		/*int testTime = 500000;
		int maxSize = 100;
		int maxValue = 100;
		boolean succeed = true;
		for (int i = 0; i < testTime; i++) {
			int[] arr1 = generateRandomArray(maxSize, maxValue);
			int[] arr2 = copyArray(arr1);
			quickSort(arr1);
			comparator(arr2);
			if (!isEqual(arr1, arr2)) {
				succeed = false;
				printArray(arr1);
				printArray(arr2);
				break;
			}
		}
		System.out.println(succeed ? "Nice!" : "Fucking fucked!");

		int[] arr = generateRandomArray(maxSize, maxValue);*/
		int[] arr = {15,34,56,6,8,90,12,1,2,3,4,52};
		printArray(arr);
		quickSort_1(arr,0,arr.length - 1 );
//		quickSort(arr);
		printArray(arr);

	}

}








package JavaTest_5;

import java.util.Arrays;

public class ArrayDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {4,1,8,7,3,8,2};
		int[] arr1 = {13,15,19,28,33,45,78,106};
		int index = halfSearch_2(arr1,79);
		System.out.println("index="+index);

		int index1 = Arrays.binarySearch(arr,5);//如果存在返回的具体的角标位置，不存在返回的是  -插入点-1
		
		
	}
	
	public static int halfSearch(int[] arr,int key)
	{
		int max,min,mid;
		min = 0;
		max = arr.length-1;
		mid = (max+min)/2;
		
		while(arr[mid]!=key)
		{
			if(key>arr[mid])
				min = mid + 1;
			else if(key<arr[mid])
				max = mid - 1;

			if(max<min)
				return -1;

			mid = (max+min)/2;
		}
		return mid;

	}
	
	public static int halfSearch_2(int[] arr,int key)
	{
		int max,min,mid;
		min = 0;
		max = arr.length-1;
	
		
		while(min<=max)
		{
			
			mid = (max+min)>>1;
			if(key>arr[mid])
				min = mid + 1;
			else if(key<arr[mid])
				max = mid - 1;
			else
				return mid;
		}
		return -min-1;
	}
	
	
	public static int getIndex(int[] arr,int key)
	{
		for(int x=0; x<arr.length; x++)
		{
			if(arr[x]==key)
				return x;
		}
		return -1;
	}
}

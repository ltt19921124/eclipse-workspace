package JavaTest_5;

public class ArrayDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		int[] arr = new int[3];
		
		int[] arr = new int[]{89,34,270,17};
		int[] arr1 = {89,34,270,17};
		
		System.out.println("length:"+arr.length);
		for(int x=0; x<arr.length ; x++)
		{
			System.out.println("arr["+x+"] = "+arr[x]+";");//arr[0] = 89;
		}
		
		for(int x=arr.length-1; x>=0; x--)
		{
			System.out.println("arr["+x+"] = "+arr[x]+";");//arr[0] = 89;
		}
		
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		
	}

}

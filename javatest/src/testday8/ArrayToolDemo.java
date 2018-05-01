package testday8;
class ArrayToolDemo 
{
	/*
	保证程序的独立运行。
	*/
	public static void main(String[] args) 
	{
		int[] arr = {4,8,2,9,72,6};

//		ArrayTool tool = new ArrayTool();


		int max= ArrayTool.getMax(arr);
		System.out.println("max="+max);


		int index = ArrayTool.getIndex(arr,8);
		System.out.println("index="+index);
	}

	

}

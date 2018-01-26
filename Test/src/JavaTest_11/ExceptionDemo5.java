package JavaTest_11;

class Demo3
{
	public int show(int index)throws ArrayIndexOutOfBoundsException
	{

		if(index<0)
			throw new ArrayIndexOutOfBoundsException("越界啦！！");
		int[] arr = new int[3];
		return arr[index];
	}
}



public class ExceptionDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Demo3 d = new Demo3();
		try
		{
			
			int num = d.show(-1);
			System.out.println("num="+num);
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.toString());

//			return ;
//			System.exit(0);//退出jvm。
		}
		finally//通常用于关闭(释放)资源。
		{
			System.out.println("finally");
		}

		System.out.println("over");
		
	}

}

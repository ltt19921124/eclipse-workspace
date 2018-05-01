package testday12;
class Demo2 extends Thread
{
	private String name;
	Demo2(String name)
	{
//		super(name);
		this.name = name;
	}
	public void run()
	{
//		int[] arr = new int[3];
//		System.out.println(arr[3]);
		for(int x=0; x<10; x++)
		{
			System.out.println("....x="+x+".....name="+Thread.currentThread().getName());
		}
	}
}




class ThreadDemo3 
{
	public static void main(String[] args) 
	{
		Demo2 d1 = new Demo2("旺财");
		Demo2 d2 = new Demo2("xiaoqiang");
		d1.start();
		d2.start();

//		System.out.println(4/0);//throw new ArithmeticException();

		for(int x=0; x<20; x++)
		{
			System.out.println(x+"...."+Thread.currentThread().getName());
		}
	}
}

package JavaTest_12;

/*
如何创建一个线程呢？

创建线程方式一：继承Thread类。

步骤：
1，定义一个类继承Thread类。
2，覆盖Thread类中的run方法。
3，直接创建Thread的子类对象创建线程。
4，调用start方法开启线程并调用线程的任务run方法执行。

可以通过Thread的getName获取线程的名称 Thread-编号(从0开始)

主线程的名字就是main。
*/

class Demo extends Thread
{
	private String name;
	Demo(String name)
	{
		super(name);
		//this.name = name;
	}
	public void run()
	{
		for(int x=0; x<10; x++)
		{
			//for(int y=-9999999; y<999999999; y++){}
			System.out.println(this.name+"....x="+x+".....name="+Thread.currentThread().getName());
		}
	}
}


public class ThreadDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Demo d1 = new Demo("旺财");
		Demo d2 = new Demo("xiaoqiang");
		
		d1.start();//开启线程，调用run方法。
		d2.start();
		
	}

}







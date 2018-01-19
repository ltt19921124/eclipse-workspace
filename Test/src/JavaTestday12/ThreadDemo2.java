package JavaTestday12;

class Demo1 extends Thread
{
	private String name;
	Demo1(String name)
	{
		super(name);
		//this.name = name;
	}
	public void run()
	{
		for(int x=0; x<10; x++)
		{
			//for(int y=-9999999; y<999999999; y++){}
			System.out.println("....x="+x+".....name="+Thread.currentThread().getName());
		}
	}
}




class ThreadDemo2 
{
	public static void main(String[] args) 
	{

//
//		Thread t1 = new Thread();

		Demo1 d1 = new Demo1("hao");
		Demo1 d2 = new Demo1("xiaoqiang");
		d1.start();//�����̣߳�����run������
		
		d2.start();
		System.out.println("over...."+Thread.currentThread().getName());
	}
}
//����run�͵���start��ʲô����

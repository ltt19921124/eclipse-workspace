package JavaTest_13;

class Ticket3 implements Runnable
{
	private  int num = 100;
	Object obj = new Object();
	boolean flag = true;
	public void run()
	{


		if(flag)
			while(true)
			{
				synchronized(obj)
				{
					show();
				}
			}
		else
			while(true)
				this.show();
	}

	public synchronized void show()
	{

		synchronized(obj)
		{
			if(num>0)
			{
				try{Thread.sleep(10);}catch (InterruptedException e){}
				
				System.out.println(Thread.currentThread().getName()+".....sale...."+num--);
			}
		}
	}
}

public class DeadLockDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Ticket3 t = new Ticket3();
//		System.out.println("t:"+t);

		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);

		t1.start();
		try{Thread.sleep(10);}catch(InterruptedException e){}
		t.flag = false;
		t2.start();
		
		
	}

}

package JavaTest_13;

class Ticket2 implements Runnable
{
	private static  int num = 100;
//	Object obj = new Object();
	boolean flag = true;
	public void run()
	{
//		System.out.println("this:"+this.getClass());

		if(flag)
			while(true)
			{
				synchronized(Ticket2.class)//(this.getClass())
				{
					if(num>0)
					{
						try{Thread.sleep(10);}catch (InterruptedException e){}						
						System.out.println(Thread.currentThread().getName()+".....obj...."+num--);
					}
				}
			}
		else
			while(true)
				this.show();
	}

	public static synchronized void show()
	{
		if(num>0)
		{
			try{Thread.sleep(10);}catch (InterruptedException e){}
			
			System.out.println(Thread.currentThread().getName()+".....function...."+num--);
		}
	}
}

public class StaticSyncFunctionLockDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ticket2 t = new Ticket2();
//		System.out.println("t:"+t.getClass());
		
		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);
		
		t1.start();
		try{Thread.sleep(10);}catch(InterruptedException e){}
		t.flag = false;
		t2.start();
		
	}

}






package testday14;
/*
�ȴ�/���ѻ��ơ� 

�漰�ķ�����

1��wait(): ���̴߳��ڶ���״̬����wait���̻߳ᱻ�洢���̳߳��С�
2��notify():�����̳߳���һ���߳�(����).
3��notifyAll():�����̳߳��е������̡߳�

��Щ���������붨����ͬ���С�
��Ϊ��Щ���������ڲ����߳�״̬�ķ�����
����Ҫ��ȷ���ײ��������ĸ����ϵ��̡߳�

Ϊʲô�����̵߳ķ���wait notify notifyAll��������Object���У� 

��Ϊ��Щ�����Ǽ������ķ�������������ʵ��������
������������Ķ�������Ķ�����õķ�ʽһ��������Object���С�

*/
//��Դ
class Resource1
{
	String name;
	String sex;
	boolean flag = false;
}


//����
class Input1 implements Runnable
{
	Resource1 r ;
//	Object obj = new Object();
	Input1(Resource1 r)
	{
		this.r = r;
	}
	public void run()
	{
		int x = 0;
		while(true)
		{
			synchronized(r)
			{
				if(r.flag)
					try{r.wait();}catch(InterruptedException e){}
				if(x==0)
				{
					r.name = "mike";
					r.sex = "nan";
				}
				else
				{
					r.name = "����";
					r.sex = "ŮŮŮŮŮŮ";
				}
				r.flag = true;
				r.notify();
			}
			x = (x+1)%2;

		}
	}
}
//���
class Output1 implements Runnable
{

	Resource1 r;
//	Object obj = new Object();
	Output1(Resource1 r)
	{
		this.r = r;
	}

	public void run()
	{
		while(true)
		{
			synchronized(r)
			{
				if(!r.flag)
					try{r.wait();}catch(InterruptedException e){}
				System.out.println(r.name+"....."+r.sex);
				r.flag = false;
				r.notify();
			}
		}
	}
}



class  ResourceDemo2
{
	public static void main(String[] args) 
	{
		//������Դ��
		Resource1 r = new Resource1();
		//��������
		Input1 in = new Input1(r);
		Output1 out = new Output1(r);
		//�����̣߳�ִ��·����
		Thread t1 = new Thread(in);
		Thread t2 = new Thread(out);
		//�����߳�
		t1.start();
		t2.start();
	}
}

package JavaTest_9;

class Fu1
{
	Fu1()
	{
		super();
//		System.out.println("o");
		show();
		return;
	}

	void show()
	{
		System.out.println("fu show");
	}
}

class Zi1 extends Fu1
{
	int num = 8;
	Zi1()
	{
		super();
		//-->通过super初始化父类内容时，子类的成员变量并未显示初始化。等super()父类初始化完毕后，
		//才进行子类的成员变量显示初始化。

		System.out.println("zi cons run...."+num);
		return;
	}
	void show()
	{
		System.out.println("zi show..."+num);
	}
}

public class ExtendsDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Zi1 z = new Zi1();
		z.show();
		
	}

}




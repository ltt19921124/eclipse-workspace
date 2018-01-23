package JavaTest_8;

class Fu
{
	public static  void show()
	{
		System.out.println("fu show run");
	}
}

class  Zi extends Fu
{
	public static void show()
	{
		System.out.println("Zi show run");
	}
}

public class ExtendsDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Zi z = new Zi();
		z.show();
		NewPhone p = new NewPhone();
		p.show();
		p.call();
		
	}

}


class Phone
{
	void call()
	{}
	void show()
	{		
		System.out.println("number");
	}
}

class NewPhone extends Phone
{
	void show()
	{
		System.out.println("name");
		System.out.println("pic");
		super.show();
	}
}
package JavaTest_10;

class Outer
{
	private static int num = 31;

	class Inner// 内部类。
	{
		void show()
		{
			System.out.println("show run..."+num);
		}
//		static void function()//如果内部类中定义了静态成员，该内部类也必须是静态的。
//		{
//			System.out.println("function run ...."+num);
//		}
	}

	public void method()
	{
		Inner in = new Inner();
		in.show();
	}
}

public class InnerClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Outer out = new Outer();
		out.method();
		
		Outer.Inner in = new Outer().new Inner();
		in.show();
		
		
	}

}




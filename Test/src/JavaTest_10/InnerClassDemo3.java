package JavaTest_10;

/*
内部类可以存放在局部位置上。 
内部类在局部位置上只能访问局部中被final修饰的局部变量。
*/

class Outer2
{
	int num = 3;
	Object method()
	{

		final int x = 9;

		class Inner
		{
			public String toString()
			{
				return "show ..."+x;
			}
		}

		Object in = new Inner();
		return in;//0x0045
//		in.show();
	}


	
}


public class InnerClassDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Outer out = new Outer();
////		Object obj = out.method();
//		System.out.println(obj);
		
	}

}

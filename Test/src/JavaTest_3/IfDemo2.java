package JavaTest_3;

public class IfDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 1;
		if(x>1)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
		System.out.println("Hello World!");

		int a = 3,b = 0;
		System.out.println(b);
		/*
		if(a>1)
			b = 100;
		else
			b = 200;
			*/
		b = (a>1)?100:200;//三元运算符就是if else 语句简写格式。
		System.out.println("b="+b);
		boolean c = a > 1;
		
	}

}

package JavaTest_4;

public class FunctionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 3;
		int b = 4;
		int c;
		c = a+b;

		c = 5+7;
		c = 9+8;
		
		c = add(a,b);
		System.out.println("c=" + c);
		
		myPrint();
		
	}
	
	public static int add(int a,int b)
	{
		return a+b;
	}
	
	
	public static void myPrint()
	{
		System.out.println("hello java");
		return ;
	}
	
}





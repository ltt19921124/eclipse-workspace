package JavaTest_4;

public class FuntionDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int c = add(4,5,6);
		System.out.println(c);
		
		printCFB(9);
		
	}
	
	public static int add(int a,int b)
	{
		return a+b;
	}
	
	public static double add(double a,double b)
	{
		return a+b;
	}
	
	public static int add(int a,int b,int c)
	{
		return add(a,b)+c;
	}
	
	public static void printCFB(int num)
	{
		for(int x=1; x<=num; x++)
		{
			for(int y=1; y<=x; y++)
			{
				System.out.print(y+"*"+x+"="+y*x+"\t");
			}
			System.out.println();
		}
	}
}

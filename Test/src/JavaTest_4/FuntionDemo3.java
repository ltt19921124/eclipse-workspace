package JavaTest_4;

public class FuntionDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		draw(3, 4);
//		draw(7, 9);
		
		print99();
		char level = getLevel(89);
		System.out.println("level=" + level);
	}
	
	public static int add(int a,int b)
	{
		int sum = a+b;
		return sum;
	}
	
	public static void draw(int row,int col)
	{
		for (int x=1; x<=row ;x++ )
		{
			for (int y=1;y<=col ; y++ )
			{
				System.out.print("*");
			}
			System.out.println();
		}
//		return ;//可以省略不写。
	}
	
	public static boolean equals(int a,int b)
	{
		/*
		if(a==b)
			return true;
		else
			return false;


		boolean x ;
		if(a==b)
			x = true;
		else
			x = false;
		return x;

		*/
//		return (a==b)?true:false;

		return a==b;
		
	}
	
	public static void print99()
	{
		for(int x=1; x<=9; x++)
		{
			for(int y=1; y<=x; y++)
			{
				System.out.print(y+"*"+x+"="+y*x+"\t");
			}
			System.out.println();
		}
	}
	
	public static char getLevel(int num)
	{
		char level ;
		if(num>=90 && num<=100)
			level = 'A';
		else if(num>=80 && num<=89)
			level =  'B';
		else if(num>=70 && num<=79)
			level =  'C';
		else if(num>=60 && num<=69)
			level =  'D';
		else 
			level =  'E';

		return level;
	}
}

package JavaTest_4;

public class ForForDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		for(int x=0; x<3; x++)
//		{
//			for(int y=0; y<4; y++)
//			{
//				System.out.print("ok" + "  ");
//			}
//			System.out.println();
//		}
		
		for(int x=0; x<4; x++)//外循环控制的是行数
		{
			for(int y=0; y<5; y++)//内循环控制的是每一行的个数 
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
	}

}

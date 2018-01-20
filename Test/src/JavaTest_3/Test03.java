package JavaTest_3;

public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int day = 0;

		for(int x=3000;x>=5; x = x/2)
		{
			day++;
			
		}

		System.out.println("day="+day);
		
		for(int x=0; x<3; x++)
		{
			for(int y=0; y<5; y++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}

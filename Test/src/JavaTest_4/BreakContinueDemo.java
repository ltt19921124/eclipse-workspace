package JavaTest_4;

public class BreakContinueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		for(int x=0; x<3; x++)
//		{
//			if(x==1)
//				break;
//			System.out.println("x="+x);
//		}
		
//		xiaoqiang:for (int x=0; x<3 ;x++ )
//		{
//			wangcai:for (int y=0; y<4 ; y++)
//			{
//				System.out.println("x="+x);
//				break xiaoqiang;
//			}
//			
//		}
		
//		for (int x=0; x<11 ;x++ )
//		{
//			if(x%2==0)
//				continue;
//			System.out.println("x="+x);
//		}
		
		xiaoqiang:for (int x=0; x<3 ;x++ )
		{
			wangcai:for (int y=0; y<4 ; y++)
			{
				System.out.println("x="+x);
				continue xiaoqiang;
			}
			
		}
		
	}

}

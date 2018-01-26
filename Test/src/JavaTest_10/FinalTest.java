package JavaTest_10;

class Single
{
	private static  Single s = new Single();
	Single(){}

	public static Single getInstance()
	{
		s = new Single();
		return s;
	}
}

class Single2
{
	private static  Single2 s = null;
	private Single2(){}
	public static Single2 getInstance()
	{
		if(s ==null)
			s = new Single2();
		return s ;
	}
}


public class FinalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Single s = Single.getInstance();
		
		
	}

}

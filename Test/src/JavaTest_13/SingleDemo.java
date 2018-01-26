package JavaTest_13;

class Single
{
	static Single s = new Single();
	private Single(){}
	public static Single getInstance()
	{
		return s;
	}
}



public class SingleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Single  ss = Single.getInstance();
		System.out.println(ss);
		
		Single s = Single.s;
		System.out.println(ss == s);
				
	}

}

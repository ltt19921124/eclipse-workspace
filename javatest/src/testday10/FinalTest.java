package testday10;
/**/
class Single
{
	private static Single s = null;
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


class Fu3
{
	Fu3(){}
}
class Zi3 extends Fu3
{

}




/*class FinalTest 
{
	public static void main(String[] args) 
	{
		new Zi3();
	}
}
*/
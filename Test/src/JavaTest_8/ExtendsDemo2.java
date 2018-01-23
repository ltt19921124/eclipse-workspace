package JavaTest_8;

class Fu1
{
	private int num = 4;

	public int getNum()
	{
		return num;
	}
}


class Zi1 extends Fu1
{
	private int num = 5;


	void show()
	{
		System.out.println(this.num+"....."+super.getNum());
	}
}

public class ExtendsDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Zi1 z = new Zi1();
		z.show();
		
	}

}

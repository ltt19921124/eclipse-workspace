package JavaTest_9;

/*
abstract class AbsDemo
{
	abstract void show1();
	abstract void show2();
}

当一个抽象类中的方法都是抽象的时候，这时可以将该抽象类用
另一种形式定义和表示，就是 接口 interface。
*/

//定义接口使用的关键字不是class，是interface.
/*
对于接口当中常见的成员：而且这些成员都有固定的修饰符。

1，全局常量: public  static final 

2，抽象方法。public abstract 

由此得出结论，接口中的成员都是公共的权限.


*/

interface A
{
	public void show();
}

interface Z
{
	public int add(int a,int b);
}

class Test implements A,Z//多实现
{
	
	public int add(int a,int b)
	{
		return a+b+3;	
	}
	/**/
	public void show(){}
	
}

interface Demo1
{
	public static final int NUM = 4;

	public abstract void show1();
	public abstract void show2();
}

class DemoImpl implements /*实现*/Demo1
{	
	
	
	public void show1(){
		
	}

	public void show2(){
	
	}
	
}



public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Test t = new Test();
//		t.show();

		DemoImpl d = new DemoImpl();	
		System.out.println(d.NUM);
		System.out.println(DemoImpl.NUM);
		System.out.println(Demo1.NUM);
		
	}

}

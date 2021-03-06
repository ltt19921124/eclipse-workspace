package JavaTest_10;

interface USB// 暴露的规则。
{
	public void open();
	public void close();
}

class UPan implements USB
{
	public void open()
	{
		System.out.println("upan open");
	}
	public void close()
	{
		System.out.println("upan close");
	}

}

class UsbMouse implements USB
{
	public void open()
	{
		System.out.println("UsbMouse open");
	}
	public void close()
	{
		System.out.println("UsbMouse close");
	}

}

public class BookPC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		useUSB(new UPan());//功能扩展了。
		useUSB(new UsbMouse());
		
	}
	
	public static void useUSB(USB u)//接口类型的引用，用于接收(指向)接口的子类对象。//USB u= new UPan();
	{
		if(u!=null)
		{
			u.open();
			u.close();
		}
	}

}

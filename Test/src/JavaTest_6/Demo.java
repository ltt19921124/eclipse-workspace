package JavaTest_6;

public class Demo {
	
	int x = 7;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d = new Demo();
		d.x = 9;
		show(d);
		System.out.println(d.x);
		
		
	}
	
	public static void show(Demo d) {
		d.x = 4;
	}

}

package JavaTest_7;

class Demo {
	int age;
	static int num = 9;
	Demo (int age) {
		this.age = age;
	}
	public static void speak() {
		System.out.println(num);
	}
	public void show() {
		System.out.println(age);
	}
}

public class StaticDemo3 {
	public static void main(String[] args) {
		
		Demo d = new Demo(30);
		d.speak();
		Demo.speak();
		
		
	}
}

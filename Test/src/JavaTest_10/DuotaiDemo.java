package JavaTest_10;

class 动物
{}

class 猫 extends 动物
{}

class 狗 extends 动物
{}

abstract class Animal
{
	abstract void eat();

}

class Dog extends Animal
{
	void eat()
	{
		System.out.println("啃骨头");
	}
	void lookHome()
	{
		System.out.println("看家");
	}
}

class Cat extends Animal
{
	void eat()
	{
		System.out.println("吃鱼");
	}
	void catchMouse()
	{
		System.out.println("抓老鼠");
	}
}

class Pig extends Animal
{
	void eat()
	{
		System.out.println("饲料");
	}
	void gongDi()
	{
		System.out.println("拱地");
	}
}

public class DuotaiDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Cat c = new Cat();
//		c.eat();
//		c.catchMouse();
		
		//如果还想用具体动物猫的特有功能。 
		//你可以将该对象进行向下转型。
		
//		Animal a = new Cat(); 
//		a.eat();
//		Cat c = (Cat)a;
//		c.catchMouse();
		
		Cat c = new Cat();
		Dog d = new Dog();
		
		method(c);
		method(d);
		method(new Pig());
		
	}
	
	public static void method(Animal a)//Animal a = new Dog();
	{
		a.eat();

		if(a instanceof Cat)//instanceof：用于判断对象的具体类型。只能用于引用数据类型判断
//						//通常在向下转型前用于健壮性的判断。

		{
			Cat c = (Cat)a;
			c.catchMouse();
		}
		else if(a instanceof Dog)
		{
			Dog d = (Dog)a;
			d.lookHome();
		}
		else
		{
		
		}
		
	}

}

package JavaTest_8;

class Demo
{
	void show1(){}
}


class DemoA extends Demo
{
//	void show1(){}
	void show2(){}
}
class DemoB extends Demo
{
//	void show1(){}
	void show3(){}
}

class A
{
	void show()
	{
		System.out.println("a");
	}
}
class B 
{
	void show()
	{
		System.out.println("b");
	}
}

/*
class C extends A,B
{
}
new C().show();
*/

class Person
{
	String name;
	int age;
}

class Student extends/*继承*/ Person
{
//	String name;
//	int age;
	void study()
	{
		System.out.println(name+"...student study.."+age);
	}
}


class Worker extends Person
{
//	String name;
//	int age;
	void work()
	{
		System.out.println("worker work");
	}
}



public class ExtendsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s = new Student();
		s.name= "zhangsan";
		s.age = 22;
		s.study();
		
	}

}

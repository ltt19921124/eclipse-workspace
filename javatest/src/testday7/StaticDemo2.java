package testday7;
class Person2
{
	private String name;
	private int age;
	static String country = "CN";
	public Person2(String name,int age)
	{
		this.name = name;
		this.age = age;
	}
	
	public void show()
	{
		System.out.println(Person2.country+":"+this.name+":"+this.age);
	}

	public static void method()
	{
		System.out.println(Person2.country);
	}
}

class StaticDemo2 
{
	public static void main(String[] args) throws Exception
	{
		Thread.sleep(8000);
		Person2.method();
		
		Person2 p = new Person2("java",20);
		p.show();
	}
}

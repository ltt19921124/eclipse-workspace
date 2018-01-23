package JavaTest_7;

class Person4 {
	private String name;
	private int age;	
	Person4()
	{		
		name = "baby";
		age = 1;
		System.out.println("person run");
	}	
	Person4(String name)	
	{
//		this();
		this.name = name;
	}
	Person4(String name,int age)
	{
		this.name = name;
		this.age = age;		
	}
	public void speak()
	{
		System.out.println(this.name+":"+this.age);
	}
	
	public boolean compare(Person4 p)
	{
		/*
		if(this.age==p.age)
			return true;
		else
			return false;
		*/
		return this.age==p.age;
		
	}
	
}

public class ThisDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person4 p1 = new Person4("aa",30);//
		Person4 p2 = new Person4("zz",12);
		
//		System.out.println(p2.compare(p1));
//		new Person4();
		
		Person4 p = new Person4("旺财",30);
		p.speak();
		
		
		Person4 p3 = new Person4("小强");
		p3.speak();
		
	}

}

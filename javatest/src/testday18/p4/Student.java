package testday18.p4;

public class Student extends Person {

	public Student() {
		super();
		
	}

	public Student(String name, int age) {
		super(name, age);
		
	}

	@Override
	public String toString() {
		
		return "Student:"+getName()+":"+getAge();
	}
	
	

	
}

package p5.wrapper;

class Person {
	void chi() {
		System.out.println("吃饭");
	}
}

//增强Person类的功能
class NewPerson {
	private Person p;
	
	NewPerson (Person p) {
		this.p = p;
	}
	
	public void chi() {
		
		System.out.println("开胃酒");
		p.chi();
		System.out.println("甜点");
		
	}
	
}


public class PersonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person();
//		p.chi();
		
		NewPerson p1 = new NewPerson(p);
		p1.chi();
		
	}

}





package day02;

public class singleton {
	private singleton() {
		
	}
	
	public static singleton s = new singleton();
	
	public static singleton getInstance() {
		
		return s;

	}
	
	
	
}

class single{
	
}

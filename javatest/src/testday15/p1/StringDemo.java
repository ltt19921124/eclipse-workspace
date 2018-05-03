package testday15.p1;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abc";
		String s1 = new String("abc");
		
		System.out.println(s == s1);
		System.out.println(s.equals(s1));
		
		stringDemo();
	}
	private static void stringDemo() {
		String s = "abc";
		String s1 = "abc";
		System.out.println(s == s1);
		
	}

}

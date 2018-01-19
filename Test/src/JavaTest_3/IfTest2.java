package JavaTest_3;

public class IfTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int month = 8;
		
		if(month<1 || month>12)
			System.out.println(month+"月没有对应的季节");
		else if(month>=3 && month<=5)
			System.out.println(month+"月是春季");
		else if(month>=6 && month<=8)
			System.out.println(month+"月是夏季");
		else if(month>=9 && month<=11)
			System.out.println(month+"月是秋季");
		else 
			System.out.println(month+"月是冬季");
		
	}

}

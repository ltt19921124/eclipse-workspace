package JavaTest_3;

public class OperateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(2<<3);
		
		//交换两个数
		int a = 3,b = 5;
		a = a + b;
		b = a - b;
		a = a - b;
		
		int c;
		c = a;
		a = b;
		b = c;
		
		System.out.println(3 ^ 5);
		
		/*
		面试的时候用。
		a = a ^ b; //a = 3 ^ 5;
		b = a ^ b; //b = (3^5)^5; b = 3;
		a = a ^ b; //a = (3^5)^3; a = 5;
		*/
		System.out.println("a="+a+",b="+b);
	}

}

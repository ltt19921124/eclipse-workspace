package JavaTest_3;

public class OperateTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int num = 61;
		
		int n1 = num & 15;//低四位
		int n2 = num & (15<<4);//高四位


		int n = n1<<4 | n2>>>4;


		System.out.println("n="+n);
		
	}

}

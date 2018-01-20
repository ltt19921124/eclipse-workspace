package JavaTest_3;

public class OperateDEmo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(3>2);
		System.out.println(3==2);
		
		/*
		 * 	^异或的运算规律：
		 *	^符号的两边结果如果相同，结果是false。
		 *	两边的结果不同，结果是true。
		 * 
		 */
		/*
		 * 面试题：
			&&:
			和&运算的结果是一样的。但是运算过程有点小区别。

			&：无论左边的运算结果是什么，右边都参与运算。
			&&：当左边为false时，右边不参与运算的。
		 * 
		 */
		
		int x = 1;

		System.out.println(x>2&x<5);
		System.out.println(x<2|x>5);
		 
	}

}

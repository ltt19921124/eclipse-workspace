package JavaTest_3;

public class IfDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		{// 局部代码块可以定义局部变量的生命周期。
			int a = 3;
			// a 的运算。
			System.out.println(a + 4);
		}

		int x = 3;
		if (x > 1)
			System.out.println("a");
		else if (x > 2)
			System.out.println("b");
		else if (x > 3)
			System.out.println("c");
		else
			System.out.println("d");

		int y = 3;
		if (y > 1)
			System.out.println("a1");
		if (y > 2)
			System.out.println("b1");
		if (y > 3)
			System.out.println("c1");
		else
			System.out.println("d1");

		if (x == 1)

			if (y == 1)

				System.out.println("a");

			else
				System.out.println("b");

		else if (y == 1)

			System.out.println("c");

		else

			System.out.println("d");
	}

}

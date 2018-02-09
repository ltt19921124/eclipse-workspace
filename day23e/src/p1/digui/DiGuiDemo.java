package p1.digui;

public class DiGuiDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 递归：
		 * 函数自身直接或者间接的调用到了自身。 
		 * 
		 * 一个功能在被重复使用，并每次使用时，参与运算的结果和上一次调用有关。 
		 * 这时可以用递归来解决问题。 
		 * 
		 * 
		 * 注意：
		 * 1，递归一定明确条件。否则容易栈溢出。 
		 * 2，注意一下递归的次数。 
		 * 
		 */
//		int sum = getSum(5);
//		
//		System.out.println(sum);
		
//		show();
		toBin(6);
//		System.out.println(3 / 2);
	}
	
	public static void toBin(int num){
		if(num>0){
			
			toBin(num/2);
			System.out.println(num%2);
			
		}
	}
	
	public static int getSum(int num){
		
		
		int x = 9;
		if(num==1)
			return 1;
		
		return num+getSum(num-1);
		
	}
	

}

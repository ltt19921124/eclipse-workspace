package p2.wrapper.demo;



public class WrapperDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 4;
		num = num + 5;
		
		Integer i =  4;//i = new Integer(4);自动装箱  简化书写。
		i = i + 6;
		
		show(55);
		
		Integer a = new Integer(128);
		Integer b = new Integer(128);
		
//		System.out.println(a == b);
//		System.out.println(a.equals(b));//true
		
		
		Integer x = 127;//jdk1.5以后，自动装箱，如果装箱的是一个字节，那么该数据会被共享不会重新开辟空间。
		Integer y = 127;
		
		System.out.println(x==y);//
		System.out.println(x.equals(y));//true
		
		
		
	}
	
	public static void show(Object a){//Object a = new Integer(55);
		System.out.println("a="+a);
	}

}






package p1.generic.demo;

import java.util.ArrayList;
import java.util.Iterator;


public class GenericDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[4];
		
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("abc");//public boolean add(Object obj)
		al.add("hahah");
//		al.add(4);//al.add(new Integer(4));
		
		Iterator<String> it = al.iterator();
		while(it.hasNext()){
			
			String str = it.next();
			System.out.println(str);
		}
		
	}

}







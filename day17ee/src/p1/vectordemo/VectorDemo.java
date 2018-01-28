package p1.vectordemo;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector v = new Vector();
		
		v.add("abc1");
		v.add("abc2");
		v.add("abc3");
		v.add("abc4");
		
		Enumeration en = v.elements();
		while(en.hasMoreElements()){
			System.out.println("nextelment:"+en.nextElement());
		}
		
		Iterator it = v.iterator();
		
		while(it.hasNext()){
			System.out.println("next:"+it.next());
		}
		
	}

}













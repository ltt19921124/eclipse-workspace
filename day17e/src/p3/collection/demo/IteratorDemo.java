package p3.collection.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Collection coll = new ArrayList();
		coll.add("abc1");
		coll.add("abc2");
		coll.add("abc3");
		coll.add("abc4");
		
		System.out.println(coll);
		
		Iterator it = coll.iterator();		
//		while(it.hasNext()){
//			System.out.println(it.next());
//		}
		
//		for(Iterator it1 = coll.iterator(); it1.hasNext(); ){
//			System.out.println(it1.next());
//		}
		
		
		
	}

}







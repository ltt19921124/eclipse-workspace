package p4.hashset.demo;

import java.util.HashSet;
import java.util.Iterator;


public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet hs = new HashSet();
		
		hs.add("hehe");
		hs.add("heihei");
		hs.add("haha");
		hs.add("xixi");
		hs.add("hehe");
		
		Iterator it = hs.iterator();
		
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
	}

}

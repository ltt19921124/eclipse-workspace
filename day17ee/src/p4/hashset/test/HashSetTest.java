package p4.hashset.test;

import java.util.HashSet;
import java.util.Iterator;

import p.bean.Person;


/*
 * 往hashSet集合中存储Person对象。如果姓名和年龄相同，视为同一个人。视为相同元素。
 */

public class HashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet hs = new HashSet();
		
		hs.add(new Person("lisi4",24));
		hs.add(new Person("lisi7",27));
		hs.add(new Person("lisi1",21));
		hs.add(new Person("lisi9",29));
		hs.add(new Person("lisi7",27));
		
		
		Iterator it = hs.iterator();
		
		while(it.hasNext()){
			Person p = (Person)it.next();
			System.out.println(p);
//			System.out.println(p.getName()+"...."+p.getAge());
		}
		
	}

}








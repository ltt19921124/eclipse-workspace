package p1.generic.demo;

import java.util.Iterator;
import java.util.TreeSet;
import p2.bean.*;

public class GenericDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		TreeSet<Person> ts = new TreeSet<Person>(new ComparatorByName());
		ts.add(new Person("lisi8",21));
		ts.add(new Person("lisi3",23));
		ts.add(new Person("lisi",21));
		ts.add(new Person("lis0",20));
		
		Iterator<Person> it = ts.iterator();
		
		while(it.hasNext()){
			Person p = it.next();
			System.out.println(p.getName()+":"+p.getAge());
		}
		
	}

}




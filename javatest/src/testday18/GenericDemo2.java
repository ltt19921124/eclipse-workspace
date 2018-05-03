package testday18;

import java.util.Iterator;
import java.util.TreeSet;



public class GenericDemo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

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

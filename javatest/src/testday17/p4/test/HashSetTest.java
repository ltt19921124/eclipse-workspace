package testday17.p4.test;

import java.util.HashSet;
import java.util.Iterator;
/*
 * ��hashSet�����д洢Person�������������������ͬ����Ϊͬһ���ˡ���Ϊ��ͬԪ�ء�
 */
public class HashSetTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		
		HashSet hs = new HashSet();
		
		/*
		 * HashSet�������ݽṹ�ǹ�ϣ�����Դ洢Ԫ�ص�ʱ��
		 * ʹ�õ�Ԫ�ص�hashCode������ȷ��λ�ã����λ����ͬ����ͨ��Ԫ�ص�equals��ȷ���Ƿ���ͬ��
		 * 
		 */
		
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

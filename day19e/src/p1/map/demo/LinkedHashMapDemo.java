package p1.map.demo;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.LinkedHashMap;


public class LinkedHashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File f= null;
		HashMap<Integer,String> hm = new LinkedHashMap<Integer,String>();
		
		hm.put(7, "zhouqi");
		hm.put(3, "zhangsan");
		hm.put(1, "qianyi");
		hm.put(5, "wangwu");
		

		Iterator<Map.Entry<Integer,String>> it = hm.entrySet().iterator();
		
		while(it.hasNext()){
			Map.Entry<Integer,String> me = it.next();
			
			Integer key = me.getKey();
			String value = me.getValue();
			
			System.out.println(key+":"+value);
		}
		
	}

}

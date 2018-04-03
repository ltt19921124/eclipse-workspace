package temp;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class hashmaptest {

	public static void main(String[] args) {
		// TODO Auto-generated method
		
		HashMap<Integer,String> hs = new HashMap<Integer,String>();
		Map<Integer, String> m = Collections.synchronizedMap(hs);
		m.put(1, "aa");
		hs.put(3, "abc");
		hs.put(4, "d");
		System.out.println(m.get(1));
		System.out.println(m.remove(4));
		System.out.println(m.put(4, "mm"));
		System.out.println(m.get(4));
		System.out.println(m.put(5, "kk"));
	
//		m.put(2, "aaa";)

	}

}

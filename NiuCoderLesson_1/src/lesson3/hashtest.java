package lesson3;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class hashtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> hs = new HashMap<>();
		
		hs.put(1, "t");
		hs.put(2, "h");
		hs.put(3, "k");
		hs.put(4, "j");
		
		Map<Integer,String> synMap = Collections.synchronizedMap(hs);
		
		System.out.println(synMap);
		
		int i = 4;
//		int a = i & 4;
		System.out.println(4 & 3);
		
	}

}

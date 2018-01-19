package JavaTestday12;

import java.util.Arrays;
import java.util.HashMap;

public class Test {

	public static void main(String[] args) {
//		int[] arr = {2,3,4,5,6};
//		System.out.println(Arrays.asList(arr).contains(2));
//		System.out.println(Arrays.asList(arr));
//		
//		double b = 8;
//		System.out.println(b);
		HashMap<String,Double> map = new HashMap<String,Double>();
	
		map.put("语文", 78.0);
		map.put("数学", 88.0);
		map.put("英语", 85.0);
		
		System.out.println(map);
	}

}

package p1.map.test;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class MapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		String str = "fdg+avAdc  bs5dDa9c-dfs";
		
		String s = getCharCount(str);
		
		System.out.println(s);
		
	}
	
	public static String getCharCount(String str) {
		
		
		//将字符串变成字符数组 
		char[] chs = str.toCharArray();
		
		//定义map集合表。
		Map<Character,Integer> map = new TreeMap<Character,Integer>();
		
		for (int i = 0; i < chs.length; i++) {
			
			if(!(chs[i]>='a' && chs[i]<='z' || chs[i]>='A' && chs[i]<='Z'))
//			if(!(Character.toLowerCase(chs[i])>='a' && Character.toLowerCase(chs[i])<='z'))
				continue;
			
			//将数组中的字母作为键去查map表。			
			Integer value = map.get(chs[i]);
			
			int count = 1;
			
			//判断值是否为null.
			if(value!=null){
				count = value+1;
			}
//			count++;
			map.put(chs[i], count);
			/*
			if(value==null){
				map.put(chs[i], 1);
			}else{
				map.put(chs[i], value+1);
			}
			*/
		}
		
		
		
		
		
		return mapToString(map);
	}
	
	private static String mapToString(Map<Character, Integer> map) {
		
		StringBuilder sb = new StringBuilder();
		
		Iterator<Character> it = map.keySet().iterator();
		
		while(it.hasNext()){
			Character key = it.next();
			Integer value = map.get(key);
			
			sb.append(key+"("+value+")");
		}
		
		return sb.toString();
	}

}





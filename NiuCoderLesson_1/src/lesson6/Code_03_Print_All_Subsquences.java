package lesson6;

import java.util.ArrayList;
import java.util.List;

public class Code_03_Print_All_Subsquences {

	public static void printAllSubsquence(String str) {
		char[] chs = str.toCharArray();
		process(chs, 0);
	}

	public static void process(char[] chs, int i) {
		if (i == chs.length) {
			System.out.println(String.valueOf(chs));
			return;
		}
		process(chs, i + 1);
		char tmp = chs[i];
		chs[i] = 0;
		process(chs, i + 1);
		chs[i] = tmp;
	}
	
	public static void function(String str) {
		char[] chs = str.toCharArray();
		process(chs, 0, new ArrayList<Character>());
	}
	
	public static void process(char[] chs, int i, List<Character> res) {
		if(i == chs.length) {
			printList(res);
		}
		List<Character> resKeep = copyList(res);
		resKeep.add(chs[i]);
		process(chs, i+1, resKeep);
		List<Character> resNoInclude = copyList(res);
		process(chs, i+1, resNoInclude);
	}
	
	public static void printList(List<Character> res) {
		// ...;
	}
	
	public static List<Character> copyList(List<Character> list){
		return null;
	}
	
	//test fibonachi
	public static int getFibinachi(int n) {
		
		if (n == 1 || n == 2) {
			return 1;
		} else
			return getFibinachi(n - 1) + getFibinachi(n - 2);
	}
	
	public static int getFibonachiSum (int n) {
		
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += getFibinachi(n);
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		String test = "abc";
		printAllSubsquence(test);
		System.out.println(getFibinachi(6));//getFibinachi(4);
		System.out.println(getFibonachiSum(4));
	}

}

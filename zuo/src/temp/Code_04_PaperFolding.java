package temp;

public class Code_04_PaperFolding {

	public static void printAllFolds(int N) {
		printProcess(1, N, true);
	}

	public static void printProcess(int i, int N, boolean down) {
		if (i > N) {
			return;
		}
		printProcess(i + 1, N, true);
		System.out.println(down ? "down " : "up ");
		printProcess(i + 1, N, false);
	}
	
	//
	public static int fiboNacci(int num) {
		if (num == 1 || num == 2) {
			return 1;
		} else {
			return fiboNacci(num - 1) + fiboNacci(num - 2);
		}
	}
	
	public static int fiboNacciSum (int n) {
		int sum = 0;
		
		for (int i = 1;i <= n;i++) {
			sum += fiboNacci(i);
		}
		
		return sum;
	}
	
	
	public static void main(String[] args) {
		int N = 4;
//		printAllFolds(N);
		
		fiboNacci(6);
		System.out.println(fiboNacci(6));
		System.out.println(fiboNacciSum(6));
		
	}
}





package basic;

public class printMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		rotate();
		int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		printArray(arr);
	
		System.out.println("=========");
		int[][] arr1 = rotate(arr,4);
		
		printArray(arr1);
		
	}

	public static int[][] rotate(int[][] arr,int n) {
//		int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		//print n*n array
		int[][] arr1 = new int[4][4];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr1[n - 1 - j][n - 1 - i] = arr[i][n - 1 - j];
			}
		}
		return arr1;
	}
	
	public static void rotate() {
		
	}
	
	public static void printArray(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	
}





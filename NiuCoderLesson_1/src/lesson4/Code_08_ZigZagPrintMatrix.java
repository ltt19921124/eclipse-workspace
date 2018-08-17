package lesson4;

public class Code_08_ZigZagPrintMatrix {
	
	public static void printMatrixZigZag(int[][] matrix) {
		int aR = 0;
		int aC = 0;
		int bR = 0;
		int bC = 0;
		int endR = matrix.length - 1;
		int endC = matrix[0].length - 1;
		boolean fromUp = false;
		while (aR != endR + 1) {
			printLevel(matrix, aR, aC, bR, bC, fromUp);
			aR = aC == endC ? aR + 1 : aR;
			aC = aC == endC ? aC : aC + 1;
			bC = bR == endR ? bC + 1 : bC;
			bR = bR == endR ? bR : bR + 1;
			fromUp = !fromUp;
		}
		System.out.println();
	}

	public static void printLevel(int[][] m, int aR, int aC, int bR, int bC, boolean f) {
		if (f) {
			while (aR != bR + 1) {
				System.out.print(m[aR++][aC--] + " ");
			}
		} else {
			while (bR != aR - 1) {
				System.out.print(m[bR--][bC++] + " ");
			}
		}
	}

	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } ,{13,14,15,16}};
		printMatrixZigZag(matrix);

	}

}

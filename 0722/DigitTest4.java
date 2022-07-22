package _0722;

public class DigitTest4 {
//	              1
//	           3  2
//	        6  5  4
//	    10  9  8  7
//	 15 14 13 12 11 를 출력해보자
	public static void main(String[] args) {
		int[][] arr = new int[5][5];
		int cnt = 1;
		for (int r = 0; r < 5; r++) {
			for (int c = 4; c >= 0; c--) {
				if (c >= 4 - r) arr[r][c] = cnt++;
			}
		}
		for (int r = 0; r < 5; r++) {
			for (int c = 0; c < 5; c++) {
				if (arr[r][c] == 0) System.out.print("   ");
				else System.out.printf("%3d", arr[r][c]);
			}
			System.out.println();
		}
		
	}
}

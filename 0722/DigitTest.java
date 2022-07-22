package _0722;

public class DigitTest {
//	15 13 10  6  1
//	   14 11  7  2
//	      12  8  3
//	          9  4
//	             5 를 출력해보자
	public static void main(String[] args) {
		int[][] arr = new int[5][5];
		int cnt = 1;
		for (int c = 4; c >= 0; c--) {
			for (int r = 0; r < 5; r++) {
				if (r <= c) arr[r][c] = cnt++;
			}
		}
		for (int r = 0; r < 5; r++) {
			for (int c = 0; c < 5; c++) {
				if (arr[r][c] == 0) System.out.print("   ");
				else System.out.printf("%3d",arr[r][c]);
			}
			System.out.println();
		}
	}
}

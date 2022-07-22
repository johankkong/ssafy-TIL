package _0722;

public class DigitTest2 {
//	5  4  3  2  1
//	   9  8  7  6
//	     12 11 10
//	        14 13
//	           15 를 출력하세요
	public static void main(String[] args) {
		int[][] arr = new int[5][5];
		int cnt = 1;
		for (int r = 0; r < 5; r++) {
			for (int c = 4; c >= 0; c--) {
				if (c >= r) arr[r][c] = cnt++;
			}
		}
		for (int r = 0; r < 5; r++) {
			for (int c = 0; c < 5; c++) {
				if(arr[r][c] == 0) System.out.print("   ");
				else System.out.printf("%3d", arr[r][c]);
			}
			System.out.println();
		}
		
	}
}

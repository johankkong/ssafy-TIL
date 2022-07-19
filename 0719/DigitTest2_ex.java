package _0719;

public class DigitTest2_ex {
	public static void main(String[] args) {
		int mid = 2;
		int cnt = 0;
		for (int i = 0; i < 5; i++) {
			int d = Math.abs(i - mid);
			int start = mid - d;
			int end = mid + d;
			for (int j = 0; j < 5; j++) {
				if (j >= start && j <= end) {
					System.out.printf("%3d", ++cnt);
				} else {
					System.out.print("   ");
				}
			}
			System.out.println();
		} 
	}
}

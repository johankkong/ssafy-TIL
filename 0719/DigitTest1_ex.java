package _0719;

public class DigitTest1_ex {
	public static void main(String[] args) {
		int cnt = 0;
		for (int i = 0; i < 5; i++) { //행
			for(int j = 0; j < 5; j++) { //열
				if (j >= i) {
					System.out.printf("%3d", ++cnt);
				} else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}
	}
}
package _0719;

public class DigitTest1 {
	public static void main(String[] args) {
		int end = 5; //행의 마지막 숫자
		int endTmp = 4; //마지막 숫자의 차이
		for (int i = 1; i <= 15; i++) {
			System.out.print(i);
			if (i == end) {
				System.out.println();
				for(int j = 1; j <= 5 - endTmp; j++) { //앞쪽 공백을 채워준다.
					System.out.print("      ");
				}
				end += endTmp; //다음행의 마지막 숫자
				endTmp -= 1;
			} else {
				if (i < 10) {
					System.out.print("     ");
				} else {
					System.out.print("    "); //두자리는 빈칸을 한 칸 줄여준다.
				}
			}
		}
	}
}

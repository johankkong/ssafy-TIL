package _0719;

public class DigitTest2 {
	public static void main(String[] args) {
		int end = 5; //각 행의 마지막 숫자
		int nextEnd = 3; //마지막 숫자의 차이는 3 1 3으로 바뀐다.
		for (int i = 1; i <= 17; i++) {
			System.out.print(i);
			if (i != end) {
				if (i < 10) {
					System.out.print("     ");				
				} else {
					System.out.print("    ");
				}
			} else {
				System.out.println();
				if (i != 12) { //12를 출력하고 나서는 다음 줄에 빈칸을 출력하면 안된다.
					for (int j = 0; j < (nextEnd + 1) % 3; j++) {
						System.out.print("      ");
					}					
				} 
				end = i + nextEnd;
				if (i == 12) { //12일 경우 다음행 마지막 수를 17로 만든다.
					end = 17;
				} else if (nextEnd == 3){ //12가 아닌 경우에만 마지막 숫자의 차이를 3이면 1로 1이면 3으로 만든다.
					nextEnd = 1;
				} else {
					nextEnd = 3;
				}
			}
		}
	}
}

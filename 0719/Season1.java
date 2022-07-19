package _0719;

import java.util.Scanner;

public class Season1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			System.out.print("월 입력>>");
			int month = sc.nextInt();
			if (month >= 3 && month <= 5) {
				System.out.printf("%d월은 봄입니다.\n", month);
			} else if (month >= 6 && month <= 8) {
				System.out.printf("%d월은 여름입니다.\n", month);
			} else if (month >= 9 && month <= 11) {
				System.out.printf("%d월은 가을입니다.\n", month);
			} else {
				System.out.printf("%d월은 겨울입니다.\n", month);				
			}
		}
		sc.close();
	}
}
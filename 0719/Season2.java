package _0719;

import java.util.Scanner;

public class Season2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 0;
		int month = 0;
		while (i < 3) {
			System.out.printf("월 입력>>");
			month = sc.nextInt();
			switch (month) {
			case 3:
			case 4:
			case 5:
				System.out.println(month + "월은 봄입니다.");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println(month + "월은 여름입니다.");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println(month + "월은 가을입니다.");
				break;
			case 12:
			case 1:
			case 2:
				System.out.println(month + "월은 겨울입니다.");
				break;
			default:
				System.out.println("알맞은 월을 입력해주세요.");
			}
			i++;
		}
		sc.close();
	}
}

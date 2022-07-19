package _0719;

import java.util.Scanner;

public class GameTest {
	public static void main(String[] args) {
		System.out.printf("가위바위보 게임을 시작합니다. 아래 보기 중 하나를 고르세요.\n\n");
		System.out.println("1.5판3승");
		System.out.println("2.3판2승");
		System.out.printf("3.1판1승\n\n");
		System.out.print("번호를 입력하세요.");

		Scanner sc = new Scanner(System.in);
		int menu = sc.nextInt();
		int victory = 1; // 목표 승리 횟수
		int match = 1; //최대 대결 횟수
		int matchNum = 0; //현재 대결 횟수
		int humanVictory = 0; //인간이 이긴 횟수
		int comVictory = 0; //컴퓨터가 이긴 횟수
		switch (menu) { //사용자의 선택에 따라 위 변수들에 다른 값을 저장
		case 1:
			match = 5;
			victory = 3;
			break;
		case 2:
			match = 3;
			victory = 2;
			break;
		case 3:
			break;
		}
		for (int i = 0; i < match; i++) { //최대 대결 횟수만큼 반복
			System.out.print("가위바위보 중 하나 입력: ");
			String human = sc.next();
			int humanNum = 0; //인간의 가위바위보 해당 숫자
			switch (human) { //사용자가 입력한 문자열을 바탕으로 
			case "가위":
				humanNum = 1;
				break;
			case "바위":
				humanNum = 2;
				break;
			case "보":
				humanNum = 3;
				break;
			default:
				System.out.println("정확히 입력해 주세요. 처음부터 시작해주세요.");
			}
			int comNum = (int) (Math.random() * 3) + 1; //컴퓨터의 가위바위보 해당 숫자
			if (humanNum == comNum) { //승패에 따라 각 승리횟수에 1을 더해준다.
				System.out.println("비겼습니다!!!");
			} else {
				if (humanNum < 3) {
					if (humanNum < comNum) {
						System.out.println("졌습니다!!!");
						comVictory += 1;
					} else {
						System.out.println("이겼습니다!!!");
						humanVictory += 1;
					}
				} else {
					if (comNum == 1) {
						System.out.println("졌습니다!!!");
						comVictory += 1;
					} else {
						System.out.println("이겼습니다!!!");
						humanVictory += 1;
					}
				}
			}
			matchNum += 1; //한판이 끝날 때 마다 1씩 더해준다.
			if (humanVictory == victory) {
				System.out.println("### 인간 승!!!");
				break; //어느 한쪽이 목표 승리 횟수에 도달하면 for문을 나가고 마무리한다.
			}
			if (comVictory == victory) {
				System.out.println("### 컴퓨터 승!!!");
				break;
			}
			if (matchNum == match) {
				System.out.println("승자가 정해지지 않았습니다. 처음부터 다시 시작해주세요.");
				break; //위처럼 승자가 정해지지 않은 채로 최대 대결 횟수에 도달하면 안내문구를 출력한다.
			}
		}
		sc.close();
	}
}

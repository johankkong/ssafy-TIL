package com.ssafy.hw.step2;

import java.util.Scanner;

public class daily2016 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int num = sc.nextInt();
		while (num != 0) { //입력하는 숫자가 0이 아닐 경우 지속적으로 반복
			for (int i = 1; i <= 9; i++) {
				System.out.printf("%d * %d = %d\n", num, i, i * num);
			}
			System.out.print("다음 숫자 입력 : ");
			num = sc.nextInt();
		}
		System.out.println("프로그램 종료");
		sc.close();
	}
}
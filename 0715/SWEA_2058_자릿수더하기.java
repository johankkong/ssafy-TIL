package 세번째날;

import java.util.Scanner;

public class SWEA_2058_자릿수더하기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;
		while (num > 1) {
			sum += num % 10;
			num /= 10;
		}
		System.out.println(sum);
	}
}

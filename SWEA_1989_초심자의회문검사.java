package 세번째날;

import java.util.Scanner;

public class SWEA_1989_초심자의회문검사 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			String test = sc.next();
			boolean flag = true;
			for (int j = 0; j <= test.length()/2; j++) {
				if (test.charAt(j) != test.charAt(test.length() - j - 1)) {
					flag = false;
					break;
				}
			}
			if (flag) {
				System.out.println("#" + (i+1) + " 1");
			} else {
				System.out.println("#" + (i+1) + " 0");
			}
		}
	}
}

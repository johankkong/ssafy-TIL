package _0719;

import java.util.Scanner;

public class _2805 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int[][] arr = new int[N][N];
			for (int i = 0; i < N; i++) {
				String line = sc.next();
				for (int j = 0; j < N; j++) {
					arr[i][j] = (int)(line.charAt(j)) - 48;
				}
			}
			int mid = N / 2;
			int sum = 0;
			for (int i = 0; i < N; i++) {
				int start = Math.abs(i - mid);
				int end = N - Math.abs(i - mid) - 1;
				for (int j = 0; j < N; j++) {
					if (j >= start && j <= end) {
						sum += arr[i][j];
					}
				}
			}
			System.out.println("#" + tc + " " + sum);
		}
		sc.close();
	}
}

package _0719;

public class fourWaySearch {
	public static void main(String[] args) {
		// 2차원 배열에서 각 요소에서 상하좌우의 합
		int cnt = 0;
		int[][] arr = new int[5][5];
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				arr[i][j] = ++cnt;
			}
		}
		for (int i=0; i<5; i++) {
			for (int j = 0 ; j < 5; j++) {
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}
		
		int[] dr = {-1, 1, 0, 0};
		int[] dc = {0, 0, -1, 1};
		
		for(int r = 0; r < 5; r++) {
			for(int c = 0; c < 5; c++) {
				int sum = arr[r][c];
				for (int d=0; d<4; d++) {
					int nr = r + dr[d];
					int nc = c + dc[d];
					//경계 처리
					if (nr >= 0 && nr < 5 && nc >= 0 && nc < 5) {
						sum += arr[nr][nc];
					}
				}
				System.out.println(r+", "+c+": "+sum);
			}
		}
	}
}

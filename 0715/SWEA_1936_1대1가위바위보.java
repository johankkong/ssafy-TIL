package 세번째날;

import java.util.Scanner;

public class SWEA_1936_1대1가위바위보 {
	public static void main(String[] args) {
		//가위 1 바위 2 보 3
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		if (A == 1) {
			if (B == 2) {
				System.out.println("B");
			} else { 
				System.out.println("A"); 
			}
		} else if (A == 2) {
			if (B == 3) {
				System.out.println("B");
			} else { 
				System.out.println("A"); 
			}
		} else {
			if (B == 1) {
				System.out.println("B");
			} else { 
				System.out.println("A"); 
			
			}
		}
	}
}
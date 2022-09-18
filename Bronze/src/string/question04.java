package string;

import java.util.Scanner;

public class question04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// 몇개 문자열 받을지
		int num = sc.nextInt();

		for(int i = 0; i < num; i++) {
			// 반복 횟수
			int R = sc.nextInt();
			// 받을 문자열
			String S = sc.next();
			
			for(int j = 0; j < S.length(); j++) {
				for(int k = 0; k < R; k++) {
					System.out.print(S.charAt(j));
				}
			}
			System.out.println();
		}
	}
}

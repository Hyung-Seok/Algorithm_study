package basic_math1;

import java.util.Scanner;

// 부녀회장이 될테야
public class question06 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		/*
			0층 1호 -> 1
			0층 2호 -> 2
			0층 3호 -> 3
			
			1층 1호 -> 1
			1층 2호 -> 3
			1층 3호 -> 6
			
			2층 1호 -> 1
			2층 2호 -> 4
			2층 3호 -> 10
		 */
		
		int[][] APT = new int[15][15];
		
		// 각층의 1호와 0층의 14호까지 값 넣기
		for(int i = 0; i < 15; i++) {
			APT[i][1] = 1;
			APT[0][i] = i;
		}
		
		// 1층 ~ 14층까지 모든 호수에 값 넣기 
		for(int i = 1; i < 15; i++) {
			for(int j = 2; j < 15; j++) {
				APT[i][j] = APT[i][j-1] + APT[i-1][j];
			}
		}
		
		// 테스트하기
		int T = sc.nextInt(); // 몇개의 테스트 케이스인지?
		
		// 배열 값 출력하기
		for(int i = 1; i <= T; i++) {
			int k = sc.nextInt(); // 몇층인지?
			int n = sc.nextInt(); // 몇호인지?
			System.out.println(APT[k][n]);
		}
	}

}

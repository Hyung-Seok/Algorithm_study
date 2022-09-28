package basic_math1;

import java.util.Scanner;

// ACM 호텔
public class question05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt(); // 테스트 케이스 개수
		
		// H 높이 W 가로 N 번째
		// N % H = 층수
		// N % H != 0 이면 (N / H) + 1 = 호수
		for(int i = 0; i < T; i++) {
			int H = sc.nextInt(); // 높이
			int W = sc.nextInt(); // 가로
			int N = sc.nextInt(); // 번째
			
			if(N % H != 0) {
				System.out.println(((N % H) * 100) + ((N / H) + 1));
			}else {
				System.out.println((H * 100) + (N / H));
			}
		}
	}

}

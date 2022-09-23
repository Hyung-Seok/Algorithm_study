package basic_math1;

import java.util.Scanner;

public class question01 {

	public static void main(String[] args) {

		// A 고정비용  B 가변비용  C 가격         A + (B*N) < C*N
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		int N = 1;
		
		// A + (B * N) < (C * N)  이럼 이득
		// N = A / (C-B)
		// A / (C-B) + 1 >= 0
		// B >= C
		// 1000 70 170
		if(B >= C) {
			System.out.println(-1);
		}else{
			System.out.println(A / (C-B) + 1);
		}
	}
}

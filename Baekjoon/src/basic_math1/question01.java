package basic_math1;

import java.util.Scanner;

public class question01 {

	public static void main(String[] args) {

		// A �������  B �������  C ����         A + (B*N) < C*N
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		int N = 1;
		
		// A + (B * N) < (C * N)  �̷� �̵�
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

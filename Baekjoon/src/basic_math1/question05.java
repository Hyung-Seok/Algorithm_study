package basic_math1;

import java.util.Scanner;

// ACM ȣ��
public class question05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt(); // �׽�Ʈ ���̽� ����
		
		// H ���� W ���� N ��°
		// N % H = ����
		// N % H != 0 �̸� (N / H) + 1 = ȣ��
		for(int i = 0; i < T; i++) {
			int H = sc.nextInt(); // ����
			int W = sc.nextInt(); // ����
			int N = sc.nextInt(); // ��°
			
			if(N % H != 0) {
				System.out.println(((N % H) * 100) + ((N / H) + 1));
			}else {
				System.out.println((H * 100) + (N / H));
			}
		}
	}

}

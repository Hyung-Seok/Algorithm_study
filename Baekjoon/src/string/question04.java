package string;

import java.util.Scanner;

public class question04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// � ���ڿ� ������
		int num = sc.nextInt();

		for(int i = 0; i < num; i++) {
			// �ݺ� Ƚ��
			int R = sc.nextInt();
			// ���� ���ڿ�
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

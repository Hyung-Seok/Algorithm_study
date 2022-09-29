package basic_math1;

import java.util.Scanner;

// �γ�ȸ���� ���׾�
public class question06 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		/*
			0�� 1ȣ -> 1
			0�� 2ȣ -> 2
			0�� 3ȣ -> 3
			
			1�� 1ȣ -> 1
			1�� 2ȣ -> 3
			1�� 3ȣ -> 6
			
			2�� 1ȣ -> 1
			2�� 2ȣ -> 4
			2�� 3ȣ -> 10
		 */
		
		int[][] APT = new int[15][15];
		
		// ������ 1ȣ�� 0���� 14ȣ���� �� �ֱ�
		for(int i = 0; i < 15; i++) {
			APT[i][1] = 1;
			APT[0][i] = i;
		}
		
		// 1�� ~ 14������ ��� ȣ���� �� �ֱ� 
		for(int i = 1; i < 15; i++) {
			for(int j = 2; j < 15; j++) {
				APT[i][j] = APT[i][j-1] + APT[i-1][j];
			}
		}
		
		// �׽�Ʈ�ϱ�
		int T = sc.nextInt(); // ��� �׽�Ʈ ���̽�����?
		
		// �迭 �� ����ϱ�
		for(int i = 1; i <= T; i++) {
			int k = sc.nextInt(); // ��������?
			int n = sc.nextInt(); // ��ȣ����?
			System.out.println(APT[k][n]);
		}
	}

}

package basic_math2;

import java.util.Scanner;

public class question02 {
// �Ҽ�
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int M = sc.nextInt(); // �ڿ��� M
		int N = sc.nextInt(); // �ڿ��� N
		
		boolean arr[] = new boolean[N+1]; // �迭 ����
		arr[0] = true;
		arr[1] = true;
		
		for(int i = 2; i < Math.sqrt(N+1); i++) {
			for(int j = i*i; j < N+1; j += i) {
				arr[j] = true;
			}
		}
		
		int min = Integer.MAX_VALUE; // �ּڰ��� ã������ ���� ����
		int value = 0; // �Ҽ� ���ϱ� ���� ���� ����
		for(int i = M; i < N+1; i++) {
			if(arr[i] == false) {
				if(min > i) {
					min = i;					
				}
					value += i;
			}
		}
		if(value == 0) {
			System.out.println(-1);
		}else {
			System.out.println(value);
			System.out.println(min);
		}
		
	}

}

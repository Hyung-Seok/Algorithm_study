package arrary;

import java.util.Arrays;
import java.util.Scanner;

public class question05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("�׽�Ʈ ���̽��� ������ �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		String[] arr = new String[num];
		
		for(int i = 0; i < num; i++) {
			arr[i] = sc.next();
		}
		for(int i = 0; i < num; i++) {
			int cnt = 0;	// ����Ƚ��
			int sum = 0;	// ���� �ջ� 
			
			for (int j = 0; j < arr[i].length(); j++) {
				
				if (arr[i].charAt(j) == 'O') {
					cnt++;
				} 
				else {
					cnt = 0;
				}
				sum += cnt;
			}
			System.out.println(sum);
		}
	}

}

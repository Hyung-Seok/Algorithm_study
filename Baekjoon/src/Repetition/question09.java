package Repetition;

import java.util.Scanner;

public class question09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum = sc.nextInt(); // ���� ��
		int result = 0; // �迭 ���ϱ�
		
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		
		for(int i = 0; i < num; i++) {
			arr[i] = sc.nextInt() * sc.nextInt(); // �Է¹��� ���� * ���� = ����
		}
		for(int i = 0; i < num; i++) {
			result += arr[i];
		}
		if(sum == result) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}

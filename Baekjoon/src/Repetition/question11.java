package Repetition;

import java.util.Scanner;

public class question11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt(); // ���� ����
		int max = sc.nextInt(); // �ִ밪
		
		int[] arr = new int[num];

		for(int i = 0; i < num; i++) {
			arr[i] = sc.nextInt();
			if(arr[i] < max) {
				System.out.print(arr[i] + " ");
			}			
		}
	}

}

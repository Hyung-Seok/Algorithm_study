package arrary;

import java.util.Scanner;

public class question06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr;
		
		System.out.print("��� ���̽��� �Է��Ͻǰǰ���? ");
		int num = sc.nextInt();
		
		for(int i = 0; i < num; i++) {
			System.out.print("����� ������ �Է��Ͻǰǰ���? ");
			int cnt = sc.nextInt();
			arr = new int[cnt];
			
			// ���� �հ�
			double sum = 0;
			
			// ���� �Է�
			for(int j = 0; j < cnt; j++) {
				arr[j] = sc.nextInt();				
				sum += arr[j];
			}
			
			double mean = (sum / cnt);
			double count = 0;
			
			for(int j = 0; j < cnt; j++) {
				if(arr[j] > mean) {
					count++;
				}
			}
			System.out.printf("%.3f%%\n",(count/cnt)*100);
		}
	}

}

package arrary;

import java.util.Scanner;

public class question04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �� ������ ���� : ");
		int N = sc.nextInt();
		
		double[] arr = new double[N];
		double plus = 0;
		double max = 0;
		
		for(int i = 0; i < N; i++) {
			arr[i] = sc.nextDouble();
			plus += arr[i];
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("�迭 ��� ���� �� : " + plus);
		System.out.println("�迭�� �� ��� : " + plus / N);
		System.out.println("�迭�� �ִ� �� : " + max);
		
		double result = (plus / N) * 100 / max;
		
		System.out.println("��� : " + result);
	}
}

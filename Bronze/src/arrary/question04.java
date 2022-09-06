package arrary;

import java.util.Scanner;

public class question04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("시험 본 과목의 개수 : ");
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
		System.out.println("배열 모두 더한 값 : " + plus);
		System.out.println("배열의 값 평균 : " + plus / N);
		System.out.println("배열의 최대 값 : " + max);
		
		double result = (plus / N) * 100 / max;
		
		System.out.println("평균 : " + result);
	}
}

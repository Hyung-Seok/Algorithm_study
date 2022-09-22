package arrary;

import java.util.Scanner;

public class question06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr;
		
		System.out.print("몇개의 케이스를 입력하실건가요? ");
		int num = sc.nextInt();
		
		for(int i = 0; i < num; i++) {
			System.out.print("몇명의 점수를 입력하실건가요? ");
			int cnt = sc.nextInt();
			arr = new int[cnt];
			
			// 점수 합계
			double sum = 0;
			
			// 점수 입력
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

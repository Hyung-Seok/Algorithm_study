package arrary;

import java.util.Arrays;
import java.util.Scanner;

public class question05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("테스트 케이스의 개수를 입력하세요 : ");
		int num = sc.nextInt();
		
		String[] arr = new String[num];
		
		for(int i = 0; i < num; i++) {
			arr[i] = sc.next();
		}
		for(int i = 0; i < num; i++) {
			int cnt = 0;	// 연속횟수
			int sum = 0;	// 누적 합산 
			
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

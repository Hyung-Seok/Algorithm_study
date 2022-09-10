package Repetition;

import java.util.Scanner;

public class question09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum = sc.nextInt(); // 예측 합
		int result = 0; // 배열 더하기
		
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		
		for(int i = 0; i < num; i++) {
			arr[i] = sc.nextInt() * sc.nextInt(); // 입력받은 가격 * 개수 = 총합
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

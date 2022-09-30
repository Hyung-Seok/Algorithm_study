package basic_math2;

import java.util.Scanner;

public class question02 {
// 소수
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int M = sc.nextInt(); // 자연수 M
		int N = sc.nextInt(); // 자연수 N
		
		boolean arr[] = new boolean[N+1]; // 배열 생성
		arr[0] = true;
		arr[1] = true;
		
		for(int i = 2; i < Math.sqrt(N+1); i++) {
			for(int j = i*i; j < N+1; j += i) {
				arr[j] = true;
			}
		}
		
		int min = Integer.MAX_VALUE; // 최솟값을 찾기위한 변수 생성
		int value = 0; // 소수 더하기 위한 변수 생성
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

package basic_math2;

import java.util.Scanner;

// 소수찾기
public class question01 {

	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt(); // 몇개를 입력할건지?
		int cnt = 0; // 개수를 측정하기 위한 변수 생성
		
		
		for(int i = 0; i < num; i++) {
			int value = sc.nextInt(); // 측정하기 위한 값 입력
			boolean check = true;
			
			if(value == 1) { // 1은 소수가 아니라 넘어가기
				continue;
			}
			for(int j = 2; j <= Math.sqrt(value); j++) { // Math.sqrt() 제곱근 함수를 이용하여 소수 찾기 
				if(value % j == 0) { // 나머지가 0이 아니라면 소수가 아니라 실패
					check = false;
				}
			}
			if(check) { // false가 아니라면 true이기떄문에 카운트세기 
				cnt++;
			}
		}
		System.out.println(cnt);
	}

}

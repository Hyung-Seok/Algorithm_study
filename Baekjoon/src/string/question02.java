package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class question02 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		int N = Integer.parseInt(br.readLine());
				
		// 데이터 입력 및 합계 변수 선언
		String b = br.readLine();		
		int sum = 0;
		
		// for문과 charAt(i)를 사용 합계 계산 
		for(int i = 0; i < N; i++)
		{
			sum += b.charAt(i) - 48;
		}
		
		// 결과 출력
		System.out.print(sum);
	}

}

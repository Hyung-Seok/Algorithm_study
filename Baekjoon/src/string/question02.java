package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class question02 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		int N = Integer.parseInt(br.readLine());
				
		// ������ �Է� �� �հ� ���� ����
		String b = br.readLine();		
		int sum = 0;
		
		// for���� charAt(i)�� ��� �հ� ��� 
		for(int i = 0; i < N; i++)
		{
			sum += b.charAt(i) - 48;
		}
		
		// ��� ���
		System.out.print(sum);
	}

}

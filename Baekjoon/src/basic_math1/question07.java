package basic_math1;

import java.util.Scanner;

public class question07 {

	public static void main(String[] args) {
		// 3Ű�� A 5Ű�� B ��ü kg
		// 3A + 5B = kg
		
		Scanner sc = new Scanner(System.in);
		
		int kg = sc.nextInt();
		int cnt = 0;
		// kg / 5 = ��
		// kg % 5 = ������
		
		while(true) {
			if((kg % 5) == 0) { // 5�� �������� �������� 0�϶�
				cnt += kg / 5;
				System.out.println(cnt);
				break;
			}else { // 5�� �������� �������� 0�� �ƴҶ�
				kg -= 3;
				cnt++;
			}
			if(kg < 0) { // kg�� ������ �ȴٸ� 5�� 3���� �������� �ʴ� ��
				System.out.println("-1");
				break;
			}
		}

	}
}



package basic_math2;

import java.util.Scanner;

// �Ҽ�ã��
public class question01 {

	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt(); // ��� �Է��Ұ���?
		int cnt = 0; // ������ �����ϱ� ���� ���� ����
		
		
		for(int i = 0; i < num; i++) {
			int value = sc.nextInt(); // �����ϱ� ���� �� �Է�
			boolean check = true;
			
			if(value == 1) { // 1�� �Ҽ��� �ƴ϶� �Ѿ��
				continue;
			}
			for(int j = 2; j <= Math.sqrt(value); j++) { // Math.sqrt() ������ �Լ��� �̿��Ͽ� �Ҽ� ã�� 
				if(value % j == 0) { // �������� 0�� �ƴ϶�� �Ҽ��� �ƴ϶� ����
					check = false;
				}
			}
			if(check) { // false�� �ƴ϶�� true�̱⋚���� ī��Ʈ���� 
				cnt++;
			}
		}
		System.out.println(cnt);
	}

}

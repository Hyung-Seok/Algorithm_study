package basic_math1;

import java.util.Scanner;

public class question07 {

	public static void main(String[] args) {
		// 3키로 A 5키로 B 전체 kg
		// 3A + 5B = kg
		
		Scanner sc = new Scanner(System.in);
		
		int kg = sc.nextInt();
		int cnt = 0;
		// kg / 5 = 몫
		// kg % 5 = 나머지
		
		while(true) {
			if((kg % 5) == 0) { // 5로 나눴을때 나머지가 0일때
				cnt += kg / 5;
				System.out.println(cnt);
				break;
			}else { // 5로 나눴을때 나머지가 0이 아닐때
				kg -= 3;
				cnt++;
			}
			if(kg < 0) { // kg이 음수가 된다면 5와 3으로 나눠지지 않는 수
				System.out.println("-1");
				break;
			}
		}

	}
}



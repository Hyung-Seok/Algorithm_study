package string;

import java.util.Scanner;

public class question10 {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("몇개 단어 입력할건가요? : ");
		int num = sc.nextInt();
		int count = 0; // 그룹 단어 개수
		
		for(int i = 0; i < num; i++) {
			System.out.print("단어를 입력해주세요 : ");
			String word = sc.next();
			boolean check[] = new boolean[26];
			boolean tmp = true;
			
			for(int j = 0; j < word.length(); j++) {
				int index = word.charAt(j)-'a';
				if(check[index]) {
					if(word.charAt(j) != word.charAt(j-1)) {
						tmp = false;
						break;
					}
				}else {
					check[index] = true;
				}
			}
			if(tmp) {
				count++;
			}
		}
		System.out.println("그룹 단어 : " + count + "개");
	}
}
	
	
	
	/*
	 * String[] arr = new String[num]; for(int i = 0; i < num; i++) {
	 * System.out.print("단어를 입력해주세요 : "); arr[i] = sc.next(); }
	 * System.out.println(num); System.out.println(arr[0]);
	 * System.out.println(arr[1]); System.out.println(arr[2]);
	 * 
	 * int sum = 0; int total = 0;
	 * 
	 * for(int i = 0; i < arr.length; i++) { for(int j = 1; j < arr[i].length();
	 * j++) { if(arr[i].charAt(j-1) != arr[i].charAt(j)) { sum = 1; } } }
	 * System.out.println(sum);
	 */
	


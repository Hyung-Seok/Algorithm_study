package string;

import java.util.Scanner;

public class question10 {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.print("몇개 단어 입력할건가요? : ");
		int count = 0;
		int num = sc.nextInt();
		
		for(int i = 0; i < num; i++) {
			if(check() == true) {
				count++;
			}
		}
		System.out.println(count);
	}
	
	public static boolean check() {
		boolean[] check = new boolean[26];
		int prev = 0;
		System.out.print("단어를 입력해주세요 : ");
		String str = sc.next();
		
		for(int i = 0; i < str.length(); i++) {
			int now = str.charAt(i);
			if(prev != now) {
				if(check[now - 'a'] == false) {
					check[now - 'a'] = true;
					prev = now;
				}else {
					return false;
				}
			}else {
				continue;
			}
		}
		return true;
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
	


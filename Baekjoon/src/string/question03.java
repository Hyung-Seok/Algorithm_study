package string;

import java.util.Scanner;

public class question03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String word = sc.next(); 
		
		
		int sum = 0;
		
		for(int i = 0; i < word.length(); i++) {
			if(word.charAt(i) >= 'A' && word.charAt(i) <= 'C') {
				sum += 3;
			}else if(word.charAt(i) >= 'D' && word.charAt(i) <= 'F') {
				sum += 4;
			}else if(word.charAt(i) >= 'G' && word.charAt(i) <= 'I') {
				sum += 5;				
			}else if(word.charAt(i) >= 'J' && word.charAt(i) <= 'L') {
				sum += 6;				
			}else if(word.charAt(i) >= 'M' && word.charAt(i) <= 'O') {
				sum += 7;
			}else if(word.charAt(i) >= 'P' && word.charAt(i) <= 'S') {
				sum += 8;
			}else if(word.charAt(i) >= 'T' && word.charAt(i) <= 'V') {
				sum += 9;
			}else if(word.charAt(i) >= 'W' && word.charAt(i) <= 'Z') {
				sum += 10;
			}
		}
		System.out.println(sum);
	}

}

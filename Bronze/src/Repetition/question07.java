package Repetition;

import java.util.Scanner;

public class question07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt();
		
		for(int i = 1; i <= count; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			System.out.println("Case #" + i + ": " + A + " + " + B + " = " + (A+B));
		}
	}

}

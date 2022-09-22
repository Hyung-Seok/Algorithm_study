package Repetition;

import java.util.Scanner;

public class question02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int C = sc.nextInt();
		int arr[] = new int[C];
		
		for(int i = 0; i < C; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			arr[i] = A + B;
		}
		
		for(int D : arr) {
			System.out.println(D);
		}
		
		
	}

}

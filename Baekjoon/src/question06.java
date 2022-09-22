import java.util.Scanner;

public class question06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int date = sc.nextInt();
		
		if(date>=1 && date<=4000) {
			if(((date%4)==0 && (date%100)!=0) || (date%400)==0){
				System.out.println("1");
			}else {
				System.out.println("0");
			}
		}
	}

}

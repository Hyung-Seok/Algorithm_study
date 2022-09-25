package basic_math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class question04 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int A = Integer.parseInt(st.nextToken()); // 달팽이가 올라감 (+)
		int B = Integer.parseInt(st.nextToken()); // 달팽이가 내려감 (-)
		int V = Integer.parseInt(st.nextToken()); // 정상
		
		int day = (V - B) / (A - B);
		
		if((V - B) % (A - B) != 0) {
			day++;
		}
		System.out.println(day);
	}

}

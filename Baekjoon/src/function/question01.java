package function;

public class question01 {

	long sum(int[] a) {
		int ans = 0;
		for(int i = 0; i < a.length; i++) {
			ans += a[i];
		}
		return ans;
	}

}

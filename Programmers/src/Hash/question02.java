package Hash;

import java.util.HashSet;

// ��Ĺ��
public class question02 {

	public int solution(int[] nums) {
		// nums �� HashSet�� �ߺ����ŷ� �־��ֱ� ���� HashSet ����
		HashSet hs = new HashSet<>();
		// HashSet�� �� ���
		for(int i = 0; i < nums.length; i++) {
			hs.add(nums[i]);
		}
		int answer = hs.size();
		if(answer > nums.length / 2) {
			answer = nums.length / 2;
		}
		return answer;

	}

}

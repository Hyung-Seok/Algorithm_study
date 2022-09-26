package Hash;

import java.util.HashSet;

// 폰캣몬
public class question02 {

	public int solution(int[] nums) {
		// nums 를 HashSet에 중복제거로 넣어주기 위해 HashSet 생성
		HashSet hs = new HashSet<>();
		// HashSet에 값 등록
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

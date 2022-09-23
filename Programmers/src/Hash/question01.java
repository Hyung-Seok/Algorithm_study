package Hash;

import java.util.Arrays;

public class question01 {

	public String solution(String[] participant, String[] completion) {
		// 배열 두개 정렬하기
		Arrays.sort(participant);
	    Arrays.sort(completion);
	        
	    int i;
	    // 배열 두개 비교해서 동일하지 않은거 반환해주기
        for(i = 0; i < completion.length; i++){
            if(!participant[i].equals(completion[i])){
                return participant[i];
            }
        }
        return participant[i];
	}
}


package Hash;

import java.util.Arrays;

public class question01 {

	public String solution(String[] participant, String[] completion) {
		// �迭 �ΰ� �����ϱ�
		Arrays.sort(participant);
	    Arrays.sort(completion);
	        
	    int i;
	    // �迭 �ΰ� ���ؼ� �������� ������ ��ȯ���ֱ�
        for(i = 0; i < completion.length; i++){
            if(!participant[i].equals(completion[i])){
                return participant[i];
            }
        }
        return participant[i];
	}
}


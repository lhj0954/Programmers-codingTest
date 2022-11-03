package 코딩테스트연습.level0;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class 진료순서정하기 {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int[] temp = emergency.clone();
        Map<Integer, Integer> map = new HashMap();

        Arrays.sort(temp);
        int degree = 1;
        for(int i = temp.length - 1; i >= 0; i--) {
            map.put(temp[i], degree);
            degree++;
        }

        for(int i = 0; i < emergency.length; i++) {
            answer[i] = map.get(emergency[i]);
        }

        return answer;
    }
}

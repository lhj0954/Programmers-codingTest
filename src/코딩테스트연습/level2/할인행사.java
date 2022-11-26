package 코딩테스트연습.level2;

import java.util.*;

public class 할인행사 {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < want.length; i++) {
            map.put(want[i], number[i]);
        }

        for(int i = 0; i <= discount.length - 10; i++) {
            HashMap<String, Integer> temp = new HashMap<>(map);
            for(int j = 0; j < 10; j++) {
                if(temp.containsKey(discount[i + j])) {
                    temp.put(discount[i + j], temp.get(discount[i + j]) - 1);
                }
            }
            boolean get = true;
            for(String key : temp.keySet()) {
                if(temp.get(key) > 0) {
                    get = false;
                    break;
                }
            }
            if(get) {
                answer++;
            }
        }

        return answer;
    }
}

package 코딩테스트연습.level2;

import java.util.HashMap;
import java.util.Map;

public class 위장 {
    public int solution(String[][] clothes) {
        int answer = 1;
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < clothes.length; i++) {
            map.put(clothes[i][1], 0);
        }
        for(int i = 0; i < clothes.length; i++) {
            map.put(clothes[i][1], map.get(clothes[i][1]) + 1);
        }

        for(String key : map.keySet()) {
            answer *= map.get(key) + 1;
        }

        return answer - 1;
    }
}

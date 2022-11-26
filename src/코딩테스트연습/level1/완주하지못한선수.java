package 코딩테스트연습.level1;

import java.util.HashMap;
import java.util.Map;

public class 완주하지못한선수 {
    static String  answer = "";
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> map = new HashMap<>();

        for(String name : participant) {
            if (map.containsKey(name)) {
                map.put(name, map.get(name) + 1);
            } else {
                map.put(name, 1);
            }
        }

        for (String name : completion) {
            map.put(name, map.get(name) - 1);
        }

        map.forEach((k, v) -> {
            if (v > 0) {
                 answer = k;
            }
        });

        return answer;
    }
}

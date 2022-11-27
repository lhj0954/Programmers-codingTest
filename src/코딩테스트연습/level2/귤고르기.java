package 코딩테스트연습.level2;

import java.util.*;

public class 귤고르기 {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        Set<Integer> keySet = map.keySet();
        for(int size : tangerine) {
            if(keySet.contains(size)) {
                map.put(size, map.get(size) + 1);
            } else {
                map.put(size, 1);
            }
        }
        List<Map.Entry<Integer, Integer>> entryList = new LinkedList<>(map.entrySet());
        entryList.sort(((o1, o2) -> map.get(o2.getKey()) - map.get(o1.getKey())));

        int sum = 0;
        for(Map.Entry<Integer, Integer> entry : entryList) {
            if(sum >= k) {
                break;
            }
            sum += entry.getValue();
            answer++;
        }

        return answer;
    }
}

package 코딩테스트연습.level1;

import java.util.*;

public class 실패율 {
    public Object[] solution(int N, int[] stages) {
        Map<Integer, Integer> map1 = new HashMap<>();
        Map<Integer, Double> map2 = new HashMap<>();
        for(int i = 1; i <= (N + 1); i++) { //map1 초기화
            map1.put(i, 0);
        }
        for(int i = 0; i < stages.length; i++) { //map1 각 스테이지에 머물고 있는 사람들 수
            map1.put(stages[i], map1.get(stages[i]) + 1);
        }
        for(int i = 1; i <= N; i++) { //map2 각 스테이지 실패율
            int clear = 0;
            for(int j = (i + 1); j <= (N + 1); j++) {
                clear += map1.get(j);
            }
            if(map1.get(i) + clear == 0) {
                map2.put(i, (double) 0);
            } else {
                map2.put(i, (double) map1.get(i) / (map1.get(i) + clear));
            }

        }

        List<Integer> keySet = new ArrayList<>(map2.keySet());
        keySet.sort((o1, o2) -> map2.get(o2).compareTo(map2.get(o1)));

        return keySet.toArray();
    }
}

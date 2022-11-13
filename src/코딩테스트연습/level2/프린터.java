package 코딩테스트연습.level2;

import java.util.*;
import java.util.Map;

public class 프린터 {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new LinkedList<>();
        for(int i = 0; i < priorities.length; i++) {
            map.put(i, priorities[i]);
            list.add(i);
        }

        while(true) {
            int temp = list.get(0);
            boolean out = true;
            for(int i = 1; i < list.size(); i++) {
                if(map.get(temp) < map.get(list.get(i))) {
                    list.remove(0);
                    list.add(temp);
                    out = false;
                    break;
                }
            }
            if(out) {
                answer++;
                if(list.get(0) == location) {
                    break;
                }
                list.remove(0);
            }
        }

        return answer;
    }
}
//location을 이름이라 생각
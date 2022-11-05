package 코딩테스트연습.level1;

import java.util.*;

public class 신고결과받기 {
    public Object[] solution(String[] id_list, String[] report, int k) {
        List<Integer> answer = new ArrayList<>();
        Map<String, Set> map1 = new HashMap<>();
        Map<String, Integer> map2 = new LinkedHashMap<>();

        for(String id : id_list) {
            map1.put(id, new HashSet<String>());
            map2.put(id, 0);
        }

        for(String repot : report) {
            String[] arr = repot.split(" ");
            map1.get(arr[1]).add(arr[0]);
        }

        for(String key : map1.keySet()) {
            if(map1.get(key).size() >= k) {
                Object[] arr = map1.get(key).toArray();
                for(Object id : arr) {
                    map2.put((String) id, map2.get(id) + 1);
                }
            }
        }

        for(String id : map2.keySet()) {
            answer.add(map2.get(id));
        }

        return answer.toArray();
    }
}
//Map<아이디, 내가 신고한 사람 리스트>
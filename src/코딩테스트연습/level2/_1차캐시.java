package 코딩테스트연습.level2;

import java.util.*;

public class _1차캐시 {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;

        if(cacheSize == 0) {
            return 5 * cities.length;
        }

        for(int i = 0; i < cities.length; i++) {
            cities[i] = cities[i].toLowerCase();
        }
        List<String> list = new ArrayList<>();

        for(String city : cities) {
            if(list.contains(city)) {
                list.remove(String.valueOf(city));
                list.add(city);
                answer += 1;
            } else {
                if(list.size() == cacheSize) {
                    list.remove(0);
                    list.add(city);
                } else {
                    list.add(city);
                }
                answer += 5;
            }
        }

        return answer;
    }
}

package 코딩테스트연습.level2;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class 롤케이크자르기 {
    public int solution(int[] topping) {
        int length = topping.length;

        Set<Integer> set = new HashSet<>();
        Map<Integer, Integer> map = new HashMap<>();

        set.add(topping[0]);
        for (int i = 1; i < length; i++) {
            int number = topping[i];
            map.put(number, map.getOrDefault(number, 0) + 1);
        }

        int answer = 0;
        for (int i = 1; i < length; i++) {
            int number = topping[i];

            set.add(number);

            int numberSize = map.get(number);
            if (numberSize == 1) {
                map.remove(number);
            } else {
                map.put(number, numberSize - 1);
            }

            if (set.size() == map.size()) {
                answer++;
            }
        }

        return answer;
    }
}
/*[시간초과]
* public int solution(int[] topping) {
        int answer = 0;
        Set<Integer> set = new HashSet<>();
        Queue<Integer> bigCake = new LinkedList<>();
        Queue<Integer> littleCake = new LinkedList<>();
        for(int top : topping) {
            set.add(top);
            bigCake.add(top);
        }
        int big = set.size();
        int little = 0;

        for(int i = 0; big >= little; i++) {
            int temp = bigCake.poll();
            if(!bigCake.contains(temp)) {
                big--;
            }
            if(!littleCake.contains(temp)) {
                little++;
            }
            littleCake.add(temp);
            if(big == little) {
                answer++;
            }
        }

        return answer;
    }
    }*/
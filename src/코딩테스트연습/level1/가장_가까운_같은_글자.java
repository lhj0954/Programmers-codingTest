package 코딩테스트연습.level1;

import java.util.*;

public class 가장_가까운_같은_글자 {
    public Object[] solution(String s) {
        List<Integer> answer = new ArrayList<>();
        List<Character> list = new ArrayList<>();

        for(int i = 0; i < s.length(); i++) {
            if(!list.contains(s.charAt(i))) {
                list.add(s.charAt(i));
                answer.add(-1);
            } else {
                int temp = 0;
                for(int j = (i - 1); j >= 0; j--) {
                    temp++;
                    if(s.charAt(j) == s.charAt(i)) {
                        break;
                    }
                }
                answer.add(temp);
            }
        }

        return answer.toArray();
    }
}

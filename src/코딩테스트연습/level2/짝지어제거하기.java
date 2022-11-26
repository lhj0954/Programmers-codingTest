package 코딩테스트연습.level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class 짝지어제거하기 {
    public int solution(String s) {
        int answer = 0;
        List<String> list = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            list.add(String.valueOf(s.charAt(i)));
            if (list.size() > 1 && list.get(list.size() - 1).equals(list.get(list.size() - 2)) ) {
                int index = list.size();
                list.remove(index - 1);
                list.remove(index - 2);
            }
        }

        System.out.println(Arrays.toString(list.toArray()));

        if (list.size() == 0) {
            answer = 1;
        }

        return answer;
    }
}

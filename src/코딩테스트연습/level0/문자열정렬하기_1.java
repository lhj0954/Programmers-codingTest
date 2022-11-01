package 코딩테스트연습.level0;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class 문자열정렬하기_1 {
    public Object[] solution(String str) {
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) <= 57) {
                list.add(Integer.parseInt(String.valueOf(str.charAt(i))));
            }
        }

        list.sort(Comparator.naturalOrder());

        return list.toArray();
    }
}

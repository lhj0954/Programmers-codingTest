package 코딩테스트연습.level2;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class 튜플 {
    public Object[] solution(String s) {
        Set<Integer> set = new LinkedHashSet<>();
        s = s.substring(1, s.length() - 1);
        String[] elements = s.split("},");
        for(int i = 0; i < elements.length; i++) {
            elements[i] = elements[i].replaceAll("[{}]", "");
        }
        Arrays.sort(elements, (String s1, String s2) -> s1.length() - s2.length());

        for(String element : elements) {
            String[] arr = element.split(",");
            for(String tuple : arr) {
                set.add(Integer.valueOf(tuple));
            }
        }

        return set.toArray();
    }
}

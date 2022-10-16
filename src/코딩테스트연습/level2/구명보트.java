package 코딩테스트연습.level2;

import java.util.*;

public class 구명보트 {
    public int solution(int[] people, int limit) {
        List<Integer> over = new ArrayList<>();
        List<Integer> less = new ArrayList<>();

        for (int i : people) {
            if (i > (limit / 2)) {
                over.add(i);
            } else {
                less.add(i);
            }
        }

        Integer[] _over = over.toArray(new Integer[0]);
        Integer[] _less = less.toArray(new Integer[0]);
        Arrays.sort(_over, Collections.reverseOrder());
        Arrays.sort(_less);

        
    }
}
package 코딩테스트연습.level1;

import java.util.*;

public class 정수내림차순으로배치하기 {
    public long solution(long n) {
        List<Long> list = new ArrayList<>();

        for (; n != 0; n /= 10) {
            list.add(n %10);
        }

        Long[] arr = list.toArray(new Long[0]);

        Arrays.sort(arr, Collections.reverseOrder());

        StringBuilder answer = new StringBuilder();
        for (Long aLong : arr) {
            answer.append(aLong);
        }

        return Long.parseLong(answer.toString());

        }
}

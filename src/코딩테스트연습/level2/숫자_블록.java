package 코딩테스트연습.level2;

import java.util.*;

public class 숫자_블록 {
    public Object[] solution(long begin, long end) {
        List<Integer> answer = new ArrayList<>();
        for (long i = begin; i <= end; i++) {
            if (i == 1) {
                answer.add(0);
                continue;
            }
            if (i == 2 || i == 3) {
                answer.add(1);
                continue;
            }
            int temp = 0;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if(i % j == 0) {
                    temp = (int) i / j;
                    if(temp <= 10000000) {
                        break;
                    } else {
                        temp = 1;
                    }
                }
            }
        }

        return answer.toArray();
    }
}

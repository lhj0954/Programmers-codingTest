package 코딩테스트연습.level1;

import java.util.Arrays;
import java.util.Collections;

public class 과일장수 {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Integer[] _score = Arrays.stream(score).boxed().toArray(Integer[]::new);
        Arrays.sort(_score, Collections.reverseOrder());

        for(int i = 0; i < _score.length; i++) {
            if(i % m == (m - 1)) {
                answer += _score[i] * m;
            }
        }

        return answer;
    }
}

package 코딩테스트연습.level0;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class 등수매기기 {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        Set<Double> average = new HashSet<>();

        for(int i = 0; i < score.length; i++) {
            average.add((double) (score[i][0] + score[i][1]) / 2);
        }
        Double[] _average = average.toArray(new Double[0]);
        Arrays.sort(_average, Collections.reverseOrder());

        int rank = 1;

        for(double i : _average) {
            int count = 0;
            for(int j = 0; j < answer.length; j++) {
                if(((double)(score[j][0] + score[j][1]) / 2) == i) {
                    answer[j] = rank;
                    count++;
                }
            }
            rank += count;
        }

        return answer;
    }
}

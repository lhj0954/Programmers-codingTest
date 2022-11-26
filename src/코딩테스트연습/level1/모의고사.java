package 코딩테스트연습.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 모의고사 {
    public Integer[] solution(int[] answers) {
        int[] count = new int[3];
        int[] first = new int[10000];
        int[] second = new int[10000];
        int[] third = new int[10000];

        int[] first_pattern = {1,2,3,4,5};
        int[] second_pattern = {2,1,2,3,2,4,2,5};
        int[] third_pattern = {3,3,1,1,2,2,4,4,5,5};

        for(int i = 0; i < 10000; i++) {
            first[i] = first_pattern[i % first_pattern.length];
            second[i] = second_pattern[i % second_pattern.length];
            third[i] = third_pattern[i % third_pattern.length];
        }

        for(int i = 0; i < answers.length; i++) {
            if(answers[i] == first[i]) {
                count[0]++;
            }
            if(answers[i] == second[i]) {
                count[1]++;
            }
            if(answers[i] == third[i]) {
                count[2]++;
            }
        }

        int max = Math.max(count[0], Math.max(count[1], count[2]));

        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < 3; i++) {
            if(count[i] == max) {
                list.add(i + 1);
            }
        }

        return list.toArray(new Integer[0]);

    }
}

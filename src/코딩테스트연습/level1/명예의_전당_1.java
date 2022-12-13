package 코딩테스트연습.level1;

import java.util.*;

public class 명예의_전당_1 {
    public Object[] solution(int k, int[] score) {
        List<Integer> answer = new ArrayList<>();
        List<Integer> list = new LinkedList<>();

        list.add(score[0]);
        answer.add(score[0]);
        for(int i = 1; i < score.length; i++) {
            boolean flag = false;
            for(int j = 0; j < list.size(); j++) {
                if(list.get(j) < score[i]) {
                    list.add(j, score[i]);
                    flag = true;
                    break;
                }
            }
            if(!flag) {
                list.add(score[i]);
            }
            if(list.size() < k) {
                answer.add(list.get(list.size() - 1));
            } else {
                answer.add(list.get(k - 1));
            }
        }

        return answer.toArray();
    }
}


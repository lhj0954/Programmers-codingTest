package 코딩테스트연습.level2;

import java.util.ArrayList;
import java.util.List;

public class 기능개발 {
    public Object[] solution(int[] progresses, int[] speeds) {
        List<Integer> answer = new ArrayList<>();

        int index = 0;
        while(index < progresses.length) {
            for(int i = 0; i < progresses.length; i++) {
                progresses[i] += speeds[i];
            }
            int count = 0;
            while(index < progresses.length && progresses[index] >= 100) {
                index++;
                count++;
            }
            if(count != 0) {
                answer.add(count);
            }
        }

        return answer.toArray();
    }
}

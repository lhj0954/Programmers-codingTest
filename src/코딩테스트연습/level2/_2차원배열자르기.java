package 코딩테스트연습.level2;

import java.util.ArrayList;
import java.util.List;

public class _2차원배열자르기 {
    public Object[] solution(int n, long left, long right) {
        List<Integer> answer = new ArrayList<>();
        int leftInt = (int)left;
        int rightInt = (int)right;

        for(long i = left; i <= right; i++){
            if(i / n <= i % n)
                answer.add((int)(i % n) + 1);
            else
                answer.add((int)(i / n) + 1);
        }

        return answer.toArray();
    }
}
//[1차 나의 풀이]
//public Object[] solution(int n, long left, long right) {
//        List<Integer> answer = new ArrayList<>();
//        int[] start = new int[n];
//        int[] end = new int[n];
//        for(int i = 0; i <= (int)(left / n); i++) { //(left / n)은 n보다 작거나 같음
//        start[i] = (int)((left / n) + 1);
//        }
//        for(int i = (int)(left / n) + 1; i < start.length; i++) {
//        start[i] = i + 1;
//        }
//        for(int i = 0; i <= (int)(right / n); i++) { //(right / n)은 n보다 작거나 같음
//        end[i] = (int)((right / n) + 1);
//        }
//        for(int i = (int)(right / n) + 1; i < end.length; i++) {
//        end[i] = i + 1;
//        }
//
//        for(int i = (int)(left % n); i < start.length; i++) {
//        answer.add(start[i]);
//        }
//        int s = (int)(left / n) + 1;
//        int e = (int)(left / n) + 1;
//        while(e < (int)(right / n)) {
//        for(int i = 0; i < (s + 1); i++) {
//        answer.add(s + 1);
//        }
//        for(int i = (s + 1); i < n; i++) {
//        answer.add(i + 1);
//        }
//        e++;
//        }
//        for(int i = 0; i <= (int)(right % n); i++) {
//        answer.add(end[i]);
//        }
//
//        return answer.toArray();
//        }
//[다른 사람 풀이]
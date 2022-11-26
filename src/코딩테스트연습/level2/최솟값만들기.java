package 코딩테스트연습.level2;

import java.util.Arrays;
import java.util.Collections;

public class 최솟값만들기 {
    public int solution(int []A, int []B) {
        Arrays.sort(A);
        Arrays.sort(B);
        int answer = 0;

        for(int i = 0; i < A.length; i++) {
            answer += A[i] * B[B.length - i - 1];
        }

        return answer;
    }
}

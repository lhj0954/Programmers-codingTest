package 코딩테스트연습.level0;

import java.util.Arrays;

public class 가까운수 {
    public int solution(int[] array, int n) {
        Arrays.sort(array);
        int answer = array[0];
        int gap = Math.abs(array[0] - n);
        for(int i = 1; i < array.length; i++) {
            if(gap > Math.abs(array[i] - n)) {
                gap = Math.abs(array[i] - n);
                answer = array[i];
            }
        }

        return answer;
    }
}

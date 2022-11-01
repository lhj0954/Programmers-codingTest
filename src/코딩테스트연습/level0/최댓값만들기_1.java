package 코딩테스트연습.level0;

import java.util.*;

public class 최댓값만들기_1 {
    public int solution(int[] numbers) {
        int answer = 0;
        Arrays.sort(numbers);
        answer = numbers[numbers.length - 1] * numbers[numbers.length - 2];
        return answer;
    }
}

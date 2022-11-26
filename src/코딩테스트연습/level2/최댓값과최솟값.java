package 코딩테스트연습.level2;

import java.util.Arrays;

public class 최댓값과최솟값 {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();

        String[] element = s.split(" ");
        int[] element_int = new int[element.length];
        for (int i = 0; i < element.length; i++) {
            element_int[i] = Integer.parseInt(element[i]);
        }
        Arrays.sort(element_int);

        answer.append(element_int[0]).append(" ");
        answer.append(element_int[element_int.length - 1]);

        return answer.toString();
    }
}

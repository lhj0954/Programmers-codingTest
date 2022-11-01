package 코딩테스트연습.level0;

import java.util.Arrays;

public class 문자열정렬하기_2 {
    public String solution(String my_string) {
        String answer = "";
        answer = my_string.toLowerCase();
        char[] elements = answer.toCharArray();

        Arrays.sort(elements);
        answer = String.valueOf(elements);

        return answer;
    }
}

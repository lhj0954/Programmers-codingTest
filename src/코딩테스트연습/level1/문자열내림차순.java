package 코딩테스트연습.level1;

import java.util.Arrays;

public class 문자열내림차순 {
    public static String solution(String s) {
        char[] arr = s.toCharArray();

        Arrays.sort(arr);

        StringBuilder answer = new StringBuilder(new String(arr,0,arr.length));

        return answer.reverse().toString();
    }
}

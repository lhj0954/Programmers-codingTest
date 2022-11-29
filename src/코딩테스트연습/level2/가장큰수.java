package 코딩테스트연습.level2;

import java.util.*;

public class 가장큰수 {
    public String solution(int[] numbers) {
        String answer = "";
        String[] _numbers = new String[numbers.length];
        for(int i = 0; i < _numbers.length; i++) {
            _numbers[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(_numbers, (String s1, String s2) -> s2.repeat(3).compareTo(s1.repeat(3)));

        StringBuilder temp = new StringBuilder();
        for(String s : _numbers) {
            temp.append(s);
        }
        answer = temp.toString();
        if(answer.charAt(0) == '0') {
            answer = "0";
        }

        return answer;
    }
}

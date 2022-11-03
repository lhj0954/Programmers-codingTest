package 코딩테스트연습.level0;

import java.util.Arrays;

public class 한번만등장한숫자 {
    public String solution(String s) {
        String answer = s;
        for(int i = 0; i < s.length(); i++) {
            for(int j = (i + 1); j < s.length(); j++) {
                if(s.charAt(i) == s.charAt(j)) {
                    answer = answer.replaceAll(String.valueOf(s.charAt(i)), "@");
                    break;
                }
            }
        }

        answer = answer.replaceAll("@", "");

        char[] temp = answer.toCharArray();
        Arrays.sort(temp);

        return String.valueOf(temp);
    }
}

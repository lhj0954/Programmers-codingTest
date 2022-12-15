package 코딩테스트연습.level1;

import java.util.*;

public class 문자열_나누기 {
    public int solution(String s) {
        int answer = 0;

        int x = 0;
        int others = 0;
        char start = '@';
        for(int i = 0; i < s.length(); i++) {
            if(x == others) {
                x = 0;
                others = 0;
                answer++;
                start = '@';
            }
            if(start == '@') {
                start = s.charAt(i);
                x++;
                continue;
            }
            if(s.charAt(i) != start) {
                others++;
            } else {
                x++;
            }
        }

        return answer;
    }
}

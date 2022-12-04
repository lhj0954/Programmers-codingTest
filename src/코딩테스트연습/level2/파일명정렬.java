package 코딩테스트연습.level2;

import java.util.*;

public class 파일명정렬 {
    public String[] solution(String[] files) {
        String[] answer = {};

        Arrays.sort(files, (String s1, String s2) -> {
            StringBuilder s1_h = new StringBuilder();
            StringBuilder s2_h = new StringBuilder();
            StringBuilder s1_t = new StringBuilder();
            StringBuilder s2_t = new StringBuilder();

            for(int i = 0; s1.charAt(i) < 48 || s1.charAt(i) > 57; i++) {
                s1_h.append(String.valueOf(s1.charAt(i)).toLowerCase());
            }
            for(int i = s1_h.length(); (i < s1.length()) && (s1.charAt(i) >= 48 && s1.charAt(i) <= 57); i++) {
                s1_t.append(s1.charAt(i));
            }
            for(int i = 0; s2.charAt(i) < 48 || s2.charAt(i) > 57; i++) {
                s2_h.append(String.valueOf(s2.charAt(i)).toLowerCase());
            }
            for(int i = s2_h.length(); (i < s2.length()) &&  (s2.charAt(i) >= 48 && s2.charAt(i) <= 57); i++) {
                s2_t.append(s2.charAt(i));
            }

            if(s1_h.toString().equals(s2_h.toString())) {
                return Integer.parseInt(s1_t.toString()) - Integer.parseInt(s2_t.toString());
            } else {
                return s1_h.toString().compareTo(s2_h.toString());
            }
        });

        System.out.print(Arrays.toString(files));

        return answer;
    }
}

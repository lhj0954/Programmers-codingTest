package 코딩테스트연습.level2;

import java.util.*;
import java.util.regex.Pattern;

public class 뉴스클러스터링 {
    public int solution(String str1, String str2) {
        double answer = 0;
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        List<String> list_1 = new ArrayList<>();
        List<String> list_2 = new ArrayList<>();
        for(int i = 0; i < str1.length() - 1; i++) {
            String pattern = "^[a-z]*$";
            String temp = str1.substring(i, i + 2);
            if(Pattern.matches(pattern, temp)) {
                list_1.add(temp);
            }
        }
        for(int i = 0; i < str2.length() - 1; i++) {
            String pattern = "^[a-z]*$";
            String temp = str2.substring(i, i + 2);
            if(Pattern.matches(pattern, temp)) {
                list_2.add(temp);
            }
        }

        int list_1_size = list_1.size();
        int list_2_size = list_2.size();
        int inter = 0;
        for(String str : list_1) {
            if(list_2.contains(str)) {
                list_2.remove(String.valueOf(str));
                inter++;
            }
        }
        int uni = list_1_size + list_2_size - inter;

        if(uni == 0) {
            answer = 1;
        } else {
            answer = (double) inter / uni;
        }

        return (int) (answer * 65536);
    }
}

package 코딩테스트연습.level2;

import java.util.*;

public class 모음사전 {
    static char[] vowels = {'A', 'E', 'I', 'O', 'U'};
    static List<String> list = new ArrayList<>();
    public void dfs (String word, String temp) {
        list.add(temp);
        if(temp.length() == 5) {
            return;
        }
        for(char vowel : vowels) {
            dfs(word, temp + vowel);
        }
    }

    public int solution(String word) {
        int answer = 0;
        String temp = "";
        dfs(word, temp);

        for(String s : list) {
            answer++;
            if(word.equals(s)) {
                break;
            }
        }

        return answer - 1;
    }
}

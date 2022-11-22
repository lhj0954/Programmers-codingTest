package 코딩테스트연습.level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 압축 {
    public static Object[] solution(String msg) {
        List<Integer> answer = new ArrayList<>();
        List<String> dictionary = new ArrayList<>();
        char a = 'A';
        dictionary.add("@"); // index 0
        for(int i = 0; i < 26; i++) { //기존 사전
            dictionary.add(String.valueOf((char)(i + a)));
        }

        for(int i = 0; i < msg.length();) {
            for(int j = (i + 1); j <= msg.length(); j++) {
                String temp = msg.substring(i, j);
                if(!dictionary.contains(temp)) {
                    dictionary.add(temp);
                    answer.add(dictionary.indexOf(msg.substring(i, j - 1)));
                    i += msg.substring(i, j - 1).length();
                    break;
                }
                if(j == msg.length()) {
                    answer.add(dictionary.indexOf(temp));
                    i += temp.length();
                }
            }
        }
        return answer.toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("KAKAO")));
    }
}

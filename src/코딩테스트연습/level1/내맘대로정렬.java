package 코딩테스트연습.level1;

import java.util.Arrays;

public class 내맘대로정렬 {
    public String[] solution(String[] strings, int n) {
        for (int i = 0; i < strings.length; i++) {
            StringBuilder str = new StringBuilder(strings[i].substring(n));
            str.insert(1, strings[i].substring(0, n));

            strings[i] = str.toString();
        }

        Arrays.sort(strings);

        for (int i = 0; i < strings.length; i++) {
            StringBuilder str = new StringBuilder(strings[i]);
            String front = strings[i].substring(1, n + 1);
            str.delete(1, n + 1);
            str.insert(0, front);

            strings[i] = str.toString();
        }

        return strings;
    }
}

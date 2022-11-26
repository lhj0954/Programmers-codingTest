package 코딩테스트연습.level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 영어끝말잇기 {
    public int[] solution(int n, String[] words) {
        List<String> used = new ArrayList<>();
        used.add(words[0]);
        int number = 0;
        int turn = 0;
        for (int i = 1; i < words.length; i++) {
            if (used.contains(words[i]) || words[i].charAt(0) != words[i - 1].charAt(words[i - 1].length() - 1)) {
                number = (i % n) + 1;
                turn = (i / n) + 1;
                break;
            } else {
                used.add(words[i]);
            }
        }

        return new int[]{number, turn};
    }
}

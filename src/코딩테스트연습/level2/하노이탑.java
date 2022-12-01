package 코딩테스트연습.level2;

import java.util.*;

public class 하노이탑 {
    static List<Integer[]> answer = new ArrayList<>();
    static void move(int no, int x, int y) {
        if (no > 1) {
            move(no - 1, x, 6 - x - y);
        }
        answer.add(new Integer[]{x, y});
        if (no > 1) {
            move(no - 1, 6 - x - y, y);
        }
    }
    public Object[] solution(int n) {
        move(n, 1, 3);
        return answer.toArray();
    }
}

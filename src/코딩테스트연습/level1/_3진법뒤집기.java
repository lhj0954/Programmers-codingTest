package 코딩테스트연습.level1;

import java.util.ArrayList;
import java.util.List;

public class _3진법뒤집기 {
    public int solution(int n) {
        int answer = 0;
        int index = 1;
        List<Integer> list = new ArrayList<>();

        for(; n > 0; n /= 3) {
            list.add(n%3);
        }

        for (int i = (list.size() - 1); i >= 0; i--) {
            answer += list.get(i)*index;
            index *= 3;
        }

        return answer;
    }

}

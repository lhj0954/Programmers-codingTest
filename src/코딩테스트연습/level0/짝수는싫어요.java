package 코딩테스트연습.level0;

import java.util.ArrayList;
import java.util.List;

public class 짝수는싫어요 {
    public Object[] solution(int n) {
        List<Integer> list = new ArrayList<>();

        for(int i = 1; i <= n; i += 2) {
            list.add(i);
        }
        return list.toArray();
    }
}

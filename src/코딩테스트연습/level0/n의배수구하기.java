package 코딩테스트연습.level0;

import java.util.ArrayList;
import java.util.List;

public class n의배수구하기 {
    public Object[] solution(int n, int[] numlist) {
        List<Integer> list = new ArrayList<>();

        for(int i : numlist) {
            if(i % n == 0) {
                list.add(i);
            }
        }

        return list.toArray();
    }
}

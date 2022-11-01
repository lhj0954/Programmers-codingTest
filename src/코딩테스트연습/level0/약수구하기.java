package 코딩테스트연습.level0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class 약수구하기 {
    public Object[] solution(int n) {
        List<Integer> list = new ArrayList<>();

        for(int i = 1; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {
                if(i == Math.sqrt(n)){
                    list.add(n / i);
                } else {
                    list.add(i);
                    list.add(n / i);
                }
            }
        }

        list.sort(Comparator.naturalOrder());

        return list.toArray();
    }
}

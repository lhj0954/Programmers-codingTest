package 코딩테스트연습.level0;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class 소인수분해 {
    public Object[] solution(int n) {
        Set<Integer> set = new HashSet<>();

        int temp = 2;
        while(n != 1) {
            if(n % temp != 0) {
                temp++;
            } else {
                set.add(temp);
                n /= temp;
            }
        }

        Integer[] answer = set.toArray(new Integer[0]);
        Arrays.sort(answer);

        return answer;
    }
}

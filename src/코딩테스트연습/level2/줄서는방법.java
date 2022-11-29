package 코딩테스트연습.level2;

import java.util.*;

public class 줄서는방법 {
    public int[] solution(int n, long k) {
        int[] answer = new int[n];

        List<Integer> people = new ArrayList<>();
        long factorial = 1;
        int index = 0;

        for(int i=1; i<=n; i++) {
            factorial *= i;
            people.add(i);
        }

        k--;
        while(n > 0) {
            factorial /= n;
            int value = (int) (k / factorial);
            answer[index++] = people.get(value);
            people.remove(value);

            k %= factorial;
            n--;
        }

        return answer;
    }
}

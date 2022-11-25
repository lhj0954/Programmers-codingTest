package 코딩테스트연습.level2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class 연속부분수열합의개수 {
    public static int solution(int[] elements) {
        Set<Integer> set = new HashSet<>();

        for(int i = 0; i < elements.length; i++) {
            List<Integer> list = new ArrayList<>();
            for(Integer j : elements) {
                list.add(j);
            }
            for(int j = 0; j < i; j++) {
                list.add(list.get(j));
            }

            for(int j = 0; j < elements.length; j++) {
                int sum = 0;
                for(int k = j; k < (j + i + 1); k++) {
                    sum += list.get(k);
                }
                set.add(sum);
            }
        }

        return set.size() ;
    }

    public static void main(String[] args) {
        int[] arr = {7,9,1,1,4};
        System.out.println(solution(arr));
    }
}

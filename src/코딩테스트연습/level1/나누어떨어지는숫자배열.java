package 코딩테스트연습.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 나누어떨어지는숫자배열 {
    public static Integer[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < arr.length; i++) {
            if ((arr[i] % divisor) == 0) {
                list.add(arr[i]);
            }
        }

        if (list.size() == 0) {
            list.add(-1);
        }

        Integer[] a = list.toArray(new Integer[0]);
        Arrays.sort(a);

        return a;
    }
}

package 코딩테스트연습.level1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class 두개뽑아서더하기 {
    public static Integer[] solution(int[] numbers) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = (i + 1); j < numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }

        Integer[] arr = set.toArray(new Integer[0]);
        Arrays.sort(arr);

        return arr;
    }
}

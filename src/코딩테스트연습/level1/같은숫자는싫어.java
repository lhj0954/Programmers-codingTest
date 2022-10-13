package 코딩테스트연습.level1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class 같은숫자는싫어 {
    public Integer[] solution(int []arr) {
        List<Integer> list = new ArrayList<>();

        list.add(arr[0]);
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] == arr[i - 1]) {
                continue;
            }
            list.add(arr[i]);
        }

        return list.toArray(new Integer[0]);
    }
}

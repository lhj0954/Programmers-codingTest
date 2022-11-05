package 코딩테스트연습.level1;

import java.util.ArrayList;
import java.util.List;

public class 제일작은수제거하기 {
    public Object[] solution(int[] arr) {
        if(arr.length == 1) {
            return new Object[]{-1};
        } else {
            int small = arr[0];
            for(int i : arr) {
                if(small > i) {
                    small = i;
                }
            }

            List<Integer> list = new ArrayList<>();
            for(int i : arr) {
                if(small != i) {
                    list.add(i);
                }
            }

            return list.toArray();
        }
    }
}

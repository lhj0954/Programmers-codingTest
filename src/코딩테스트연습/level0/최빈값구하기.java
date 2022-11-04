package 코딩테스트연습.level0;

import java.util.HashSet;
import java.util.Set;

public class 최빈값구하기 {
    public int solution(int[] array) {
        int answer = 0;
        Set<Integer> set = new HashSet<>();
        for(int i : array) {
            set.add(i);
        }

        int[][] table = new int[set.size()][2];
        int index = 0;
        for(Integer i : set) {
            int count = 0;
            for(int j = 0; j < array.length; j++) {
                if(array[j] == i) {
                    count++;
                }
            }
            table[index][0] = i;
            table[index][1] = count;
            index++;
        }

        int big = table[0][1];
        for(int i = 0; i < table.length; i++) {
            if(big <= table[i][1]) {
                big = table[i][1];
            }
        }

        int count = 0;
        for(int i = 0; i < table.length; i++) {
            if(big == table[i][1]) {
                answer = table[i][0];
                count++;
            }
        }

        if(count > 1) {
            return -1;
        } else {
            return answer;
        }

    }
}

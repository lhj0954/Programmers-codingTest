package 코딩테스트연습.level2;

import java.util.*;

public class 우박수열_정적분 {
    public static double[] solution(int k, int[][] ranges) {
        double[] answer = new double[ranges.length];

        int idx = 1;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, k);
        while(k != 1) {
            if(k % 2 == 0) {
                k /= 2;
            } else {
                k = k * 3 + 1;
            }
            map.put(idx, k);
            idx++;
        }

        int i = 0;
        for(int[] range : ranges) {
            if(range[0] > map.size() + range[1] - 1) {
                answer[i++] = -1.0;
            } else if(range[0] == map.size() + range[1] - 1) {
                answer[i++] = 0.0;
            } else {
                double temp = 0;
                for(int j = range[0]; j < map.size() + range[1] - 1; j++) {
                    temp += ((double)map.get(j) + map.get(j + 1)) / 2;
                }
                answer[i++] = temp;
            }
        }

        return answer;
    }
}

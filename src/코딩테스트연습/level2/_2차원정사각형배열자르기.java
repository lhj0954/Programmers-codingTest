package 코딩테스트연습.level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _2차원정사각형배열자르기 {
    public static Object[] solution(int n, long left, long right) {
        List<Integer> answer = new ArrayList<>();
        int[][] arr_2 = new int[n][n];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j <= i; j++) {
                arr_2[i][j] = (i + 1);
            }
            for(int j = 0; j <= i; j++) {
                arr_2[j][i] = (i + 1);
            }
        }

        for(int i = (int)(left % n); i < n; i++) {
            answer.add(arr_2[(int)(left / n)][i]);
        }
        for(int i = (int) ((left / n) + 1); i < (int)(right / n); i++) {
            for(int j : arr_2[i]) {
                answer.add(j);
            }
        }
        for(int i = 0; i <= (int)(right % n); i++) {
            answer.add(arr_2[(int)(right / n)][i]);
        }

        return answer.toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(4, 7, 14)));
    }
}

package 코딩테스트연습.level1;

import java.util.Arrays;

public class 비밀지도 {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String[][] map = new String[n][n];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = (n - 1); j >= 0; j--) {
                if ((arr1[i] % 2) == 1) {
                    map[i][j] = "#";
                } else {
                    map[i][j] = " ";
                }
                arr1[i] /= 2;
            }
        }

        for (int i = 0; i < arr2.length; i++) {
            for (int j = (n - 1); j >= 0; j--) {
                if (!map[i][j].equals("#")) {
                    if ((arr2[i] % 2) == 1) {
                        map[i][j] = "#";
                    } else {
                        map[i][j] = " ";
                    }
                }
                arr2[i] /= 2;
            }
        }

        for (int i = 0; i < answer.length; i++) {
            StringBuilder str = new StringBuilder();
            for (int j = 0; j < n; j++) {
                str.append(map[i][j]);
            }
            answer[i] = str.toString();
        }

        System.out.println(Arrays.toString(answer));

        return answer;
    }
}

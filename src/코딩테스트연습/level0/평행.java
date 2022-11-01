package 코딩테스트연습.level0;

import java.util.Objects;

public class 평행 {
    public static Double inclination(int[] dot_1, int[] dot_2) {
        double large_x;
        double large_y;
        double small_x;
        double small_y;

        if (dot_1[0] >= dot_2[0]) {
            large_x = dot_1[0];
            large_y = dot_1[1];
            small_x = dot_2[0];
            small_y = dot_2[1];
        } else {
            large_x = dot_2[0];
            large_y = dot_2[1];
            small_x = dot_1[0];
            small_y = dot_1[1];
        }

        if ((large_x - small_x) == 0) {
            return null;
        } else {
            return (large_y - small_y) / (large_x - small_x);
        }
    }

    public static int solution(int[][] dots) {
        int answer = 0;
        Double[] inclinations = new Double[6];

        int index = 0;
        for (int j = 0; j < dots.length; j++) {
            for (int k = (j + 1); k < dots.length; k++) {
                inclinations[index] = inclination(dots[j], dots[k]);
                index++;
            }
        }

        for (int i = 0; i < inclinations.length; i++) {
            for (int j = (i + 1); j < inclinations.length; j++) {
                if (Objects.equals(inclinations[i], inclinations[j])) {
                    answer = 1;
                    break;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[][] arr = {{3, 5}, {4, 1}, {2, 4}, {5, 10}};
        System.out.println(solution(arr));
    }
}

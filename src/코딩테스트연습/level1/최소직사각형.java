package 코딩테스트연습.level1;

import java.util.Arrays;

public class 최소직사각형 {
    public int solution(int[][] sizes) {
        for(int i = 0; i < sizes.length; i++) { //죄다 가로로 눕히기
            if (sizes[i][0] < sizes[i][1]) {
                int temp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = temp;
            }
        }

        int width = 0;
        int height = 0;

        for (int i = 0; i < sizes.length; i++) {
            if (sizes[i][0] > width) {
                width = sizes[i][0];
            }
            if (sizes[i][1] > height) {
                height = sizes[i][1];
            }
        }

        return width*height;
    }
}

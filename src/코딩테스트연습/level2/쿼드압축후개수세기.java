package 코딩테스트연습.level2;

import java.util.*;

public class 쿼드압축후개수세기 {
    static int one_count = 0;
    static int zero_count = 0;
    static void zip (int[][] arr) {
        if(arr.length == 1) {
            if(arr[0][0] == 1) {
                one_count++;
            } else {
                zero_count++;
            }
            return;
        }

        boolean zero = false;
        boolean one = false;

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] == 1) {
                    one = true;
                } else {
                    zero = true;
                }
            }
            if(one && zero) {
                break;
            }
        }

        if(one && zero) {
            int[][] temp = new int[arr.length / 2][arr.length / 2];
            for(int i = 0; i < (arr.length / 2); i++) {
                for(int j = 0; j < (arr.length / 2); j++) {
                    temp[i][j] = arr[i][j];
                }
            }
            zip(temp);

            for(int i = 0; i < (arr.length / 2); i++) {
                for(int j = 0; j < (arr.length / 2); j++) {
                    temp[i][j] = arr[i][j + (arr.length / 2)];
                }
            }
            zip(temp);

            for(int i = 0; i < (arr.length / 2); i++) {
                for(int j = 0; j < (arr.length / 2); j++) {
                    temp[i][j] = arr[i + (arr.length / 2)][j];
                }
            }
            zip(temp);

            for(int i = 0; i < (arr.length / 2); i++) {
                for(int j = 0; j < (arr.length / 2); j++) {
                    temp[i][j] = arr[i][j + (arr.length) / 2];
                }
            }
            zip(temp);
        } else {
            if(arr[0][0] == 1) {
                one_count++;
            } else {
                zero_count++;
            }
        }

    }
    public static int[] solution(int[][] arr) {
        zip(arr);
        return new int[]{zero_count, one_count};
    }

    public static void main(String[] args) {
        int[][] arr =  {{1, 1, 0, 0}, {1, 0, 0, 0}, {1, 0, 0, 1}, {1, 1, 1, 1}};
        System.out.println(Arrays.toString(solution(arr)));
    }
}

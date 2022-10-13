package 코딩테스트연습.level1;

import java.util.Arrays;

public class 다트게임 {
    public static int solution(String dartResult) {
        char[] shots = dartResult.toCharArray();

        StringBuilder value = new StringBuilder();
        for (int i = 0; i < shots.length; i++) {
            if (shots[i] >= 48 && shots[i] <= 57) {
                value.append(shots[i]);
            } else {
                value.append(" ");
            }
        }

        String[] _arr_scores =  value.toString().split("\\s+"); //점수들만 선별
        int[] arr_scores = new int[_arr_scores.length];

        for (int i = 0; i < _arr_scores.length; i++) {
            arr_scores[i] = Integer.parseInt(_arr_scores[i]);
        }

        int index = 0;
        for (int i = 0; i < shots.length; i++) {
            if (shots[i] >= 48 && shots[i] <= 57) {
                if (i > 0) {
                    if (shots[i - 1] < 48 || shots[i - 1] > 57) {
                        index++;
                    }
                }
            } else {
                switch (shots[i]) {
                    case 'S' :
                        arr_scores[index] = (int) Math.pow(arr_scores[index], 1);
                        break;
                    case 'D' :
                        arr_scores[index] = (int) Math.pow(arr_scores[index], 2);
                        break;
                    case 'T' :
                        arr_scores[index] = (int) Math.pow(arr_scores[index], 3);
                        break;
                    case '#' :
                        arr_scores[index] *= -1;
                        break;
                    case '*' :
                        if (index == 0) {
                            arr_scores[index] *= 2;
                        } else {
                            arr_scores[index] *= 2;
                            arr_scores[index - 1] *=2;
                        }
                        break;
                }
            }
        }

        return arr_scores[0]+arr_scores[1]+arr_scores[2];
    }

    public static void main(String[] args) {
        System.out.println(solution("1D#2S*3S"));
    }
}

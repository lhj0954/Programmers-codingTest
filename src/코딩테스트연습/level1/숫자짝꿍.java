package 코딩테스트연습.level1;

import java.util.*;

public class 숫자짝꿍 {
    public static String solution(String X, String Y) {
        int[] numbers = new int[10];
        List<Integer> temp = new ArrayList<>();


        for(int i = 0; i < X.length(); i++) {
            String x = X.substring(i, i + 1);
            numbers[Integer.parseInt(x)]++;
        }
        for(int i = 0; i < Y.length(); i++) {
            String y = Y.substring(i, i + 1);
            if(numbers[Integer.parseInt(y)] > 0) {
                temp.add(Integer.parseInt(y));
                numbers[Integer.parseInt(y)]--;
            }
        }

        temp.sort(Collections.reverseOrder());

        StringBuilder answer = new StringBuilder();
        for(Integer i : temp) {
            answer.append(i);
        }

        if (answer.length() == 0) {
            return "-1";
        } else if (answer.substring(0, 1).equals("0")) {
            return "0";
        } else {
            return answer.toString();
        }

    }

    public static void main(String[] args) {
        System.out.println(solution("5525", "1255"));
    }
}

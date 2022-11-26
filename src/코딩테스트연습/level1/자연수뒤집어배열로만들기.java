package 코딩테스트연습.level1;

import java.util.Arrays;
import java.util.Scanner;

public class 자연수뒤집어배열로만들기 {
    public long[] solution(long n) {
        long copy = n;
        int length = 0;

        for(; copy != 0; copy /= 10) {
            length++;
        }

        long[] answer = new long[length];

        for(int i = 0; i < answer.length; i++) {
            answer[i] = n % 10;
            n /= 10;
        }

        return answer;
    }
}

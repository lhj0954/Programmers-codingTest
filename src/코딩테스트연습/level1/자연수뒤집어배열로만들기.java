package 코딩테스트연습.level1;

import java.util.Arrays;
import java.util.Scanner;

public class 자연수뒤집어배열로만들기 {
    static public long[] solution(long n) {
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        System.out.println(Arrays.toString(solution(n)));
    }
}

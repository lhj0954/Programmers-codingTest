package 코딩테스트연습.level1;

import java.util.Scanner;

public class 짝수와홀수 {
    static public String solution (int num) {
        if (num%2 == 0) {
            return "Even";
        }
        else {
            return "Odd";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        System.out.println(solution(num));
    }
}

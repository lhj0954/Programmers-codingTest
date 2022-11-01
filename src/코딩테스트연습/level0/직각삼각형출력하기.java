package 코딩테스트연습.level0;

import java.util.Scanner;

public class 직각삼각형출력하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            String answer = "*";
            System.out.println(answer.repeat(i));
        }
    }
}

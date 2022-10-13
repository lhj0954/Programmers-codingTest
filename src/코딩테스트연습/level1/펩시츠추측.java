package 코딩테스트연습.level1;

import java.util.Scanner;

public class 펩시츠추측 {
    public static int count = 0;

    static public int solution(int n) {
        if (count  > 500) {
            return -1;
        }

        if (n == 1) {
            return count;
        } else {
            if ( (n % 2) == 1) {
                count++;
                return solution(n * 3 + 1);
            } else {
                count++;
                return solution(n / 2);
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(solution(n));
    }
}

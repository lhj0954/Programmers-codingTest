package 코딩테스트연습.level0;

public class 분수의덧셈 {
    public static int Euclid(int m, int n) {
        if(n == 0) {
            return m;
        } else {
            return Euclid(n, m % n);
        }
    }
    public int[] solution(int denum1, int num1, int denum2, int num2) {
        int denum = 0;
        int num = 0;

        int gcd_1 = Euclid(Math.max(num1, num2), Math.min(num1, num2));
        denum = denum1 * (num2 / gcd_1) + denum2 * (num1 / gcd_1);
        num = gcd_1 * (num1 / gcd_1) * (num2 / gcd_1);

        int gcd_2 = Euclid(Math.max(denum, num), Math.min(denum, num));
        denum /= gcd_2;
        num /= gcd_2;

        return new int[]{denum, num};
    }
}

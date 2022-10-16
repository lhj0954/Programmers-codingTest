package 코딩테스트연습.level2;

public class 피보나치수 {
    public static int solution(int n) {
        int[] f_arr = new int[n + 1];
        f_arr[0] = 0;
        f_arr[1] = 1;

        for (int i = 2; i <= n; i++) {
            f_arr[i] = (f_arr[i - 2] + f_arr[i - 1]) % 1234567;
        }

        return f_arr[n];
    }

    public static void main(String[] args) {
        System.out.println(solution(5));
    }
}

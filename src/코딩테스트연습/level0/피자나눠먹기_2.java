package 코딩테스트연습.level0;

public class 피자나눠먹기_2 {
    public static int Euclid(int a, int b) {
        if(b == 0) {
            return a;
        } else {
            return Euclid(b, a % b);
        }
    }

    public int solution(int n) {
        int answer = 0;
        if(n >= 6) {
            answer = Euclid(n, 6);
        } else {
            answer = Euclid(6, n);
        }

        answer = n / answer;

        return answer;
    }
}

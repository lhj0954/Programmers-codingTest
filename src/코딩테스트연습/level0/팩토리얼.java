package 코딩테스트연습.level0;

public class 팩토리얼 {
    public static int factorial(int n) {
        if(n == 1) {
            return 1;
        } else {
            return n*factorial(n - 1);
        }
    }

    public int solution(int n) {
        int answer = 0;

        for(int i = 1; factorial(i) <= n; i++) {
            answer = i;
        }

        return answer;
    }
}

package 코딩테스트연습.level1;

public class 약수의합 {
    static public int solution(int num) {
        int answer = 0;

        if (num == 0) {
            answer = 0;
        } else {
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    answer += i;
                }
            }
        }

        return answer;
    }
}

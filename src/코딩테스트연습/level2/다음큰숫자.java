package 코딩테스트연습.level2;

public class 다음큰숫자 {
    public int solution(int n) {
        int answer = (n + 1);
        int n_1_count = 0;
        for (; n > 0; n /= 2) {
            if ((n % 2) == 1) {
                n_1_count++;
            }
        }

        while (true) {
            int temp = answer;
            int answer_1_count = 0;
            for (; temp > 0; temp /= 2) {
                if ((temp % 2) == 1) {
                    answer_1_count++;
                }
            }
            if (answer_1_count == n_1_count) {
                break;
            } else {
                answer++;
            }
        }

        return answer;
    }
}

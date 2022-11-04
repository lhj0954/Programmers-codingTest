package 코딩테스트연습.level0;

public class 저주의숫자3 {
    public int solution(int n) {
        int answer = 0;

        for(int i = 1; i <= n; i++) {
            int jump = 1;
            while((answer + jump) % 3 == 0 || String.valueOf(answer + jump).contains("3")) {
                jump++;
            }
            answer += jump;
        }

        return answer;
    }
}

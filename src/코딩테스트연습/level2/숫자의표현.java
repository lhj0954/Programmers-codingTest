package 코딩테스트연습.level2;

public class 숫자의표현 {
    public int solution(int n) {
        int answer = 0;

        for(int i = 1; i <= n/2; i++) {
            int temp = i;
            for(int j = (i + 1); temp < n; j++) {
                temp += j;
                if (temp == n) {
                    answer++;
                    break;
                }
            }
        }

        answer++; //자기자신

        return answer;
    }
}

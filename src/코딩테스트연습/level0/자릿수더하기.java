package 코딩테스트연습.level0;

public class 자릿수더하기 {
    public int solution(int n) {
        int answer = 0;
        for(; n > 0; n /= 10) {
            answer += n % 10;
        }
        return answer;
    }
}

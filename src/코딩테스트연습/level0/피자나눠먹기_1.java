package 코딩테스트연습.level0;

public class 피자나눠먹기_1 {
    public int solution(int n) {
        int answer = 0;
        if(n%7 != 0) {
            answer = n/7 + 1;
        } else {
            answer = n/7;
        }
        return answer;
    }
}

package 코딩테스트연습.level0;

public class 피자나눠먹기_3 {
    public int solution(int slice, int n) {
        int answer = 0;
        if(n % slice != 0) {
            answer = n / slice + 1;
        } else {
            answer = n / slice;
        }
        return answer;
    }
}

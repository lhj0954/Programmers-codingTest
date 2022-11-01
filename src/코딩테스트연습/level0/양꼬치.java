package 코딩테스트연습.level0;

public class 양꼬치 {
    public int solution(int n, int k) {
        int answer = 0;
        answer = n*12000 + (k - n/10)*2000;
        return answer;
    }
}

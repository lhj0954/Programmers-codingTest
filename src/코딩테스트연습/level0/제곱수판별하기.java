package 코딩테스트연습.level0;

public class 제곱수판별하기 {
    public int solution(int n) {
        int answer = 2;
        double root = Math.sqrt(n);

        if((int)root == root) {
            answer = 1;
        }
        return answer;
    }
}

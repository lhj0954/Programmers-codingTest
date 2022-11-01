package 코딩테스트연습.level0;

public class 주사위개수 {
    public int solution(int[] box, int n) {
        int answer = 0;
        answer = box[0] / n;
        answer *= box[1] / n;
        answer *= box[2] / n;
        return answer;
    }
}

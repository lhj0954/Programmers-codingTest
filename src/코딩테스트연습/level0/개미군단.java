package 코딩테스트연습.level0;

public class 개미군단 {
    public int solution(int hp) {
        int answer = 0;
        answer += hp / 5;
        hp = hp % 5;
        answer += hp / 3;
        hp = hp % 3;
        answer += hp;
        return answer;
    }
}

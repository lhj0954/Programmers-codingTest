package 코딩테스트연습.level0;

public class _369게임 {
    public int solution(int order) {
        int answer = 0;
        for(; order > 0; order /= 10) {
            if(order % 10 == 3 || order % 10 == 6 || order % 10 == 9) {
                answer++;
            }
        }
        return answer;
    }
}

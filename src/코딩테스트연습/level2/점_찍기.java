package 코딩테스트연습.level2;

public class 점_찍기 {
    public long solution(int k, int d) {
        long answer = 0;

        for(long x = 0; k * x <= d; x++) {
            int y = (int)Math.sqrt((long)d * d - ((long)k * x * k * x));
            answer += ((y / k) + 1);
        }

        return answer;
    }
}

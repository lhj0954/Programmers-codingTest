package 코딩테스트연습.level0;

public class 공던지기 {
    public int solution(int[] numbers, int k) {
        return (1 + (k - 1) * 2) % numbers.length;
    }
}

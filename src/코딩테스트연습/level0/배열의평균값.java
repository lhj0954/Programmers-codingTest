package 코딩테스트연습.level0;

public class 배열의평균값 {
    public double solution(int[] numbers) {
        double answer = 0;
        for(int i : numbers) {
            answer += (double) i / numbers.length;
        }
        return answer;
    }
}

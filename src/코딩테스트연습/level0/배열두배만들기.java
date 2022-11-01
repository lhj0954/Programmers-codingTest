package 코딩테스트연습.level0;

public class 배열두배만들기 {
    public int[] solution(int[] numbers) {
        int[] answer = numbers.clone();
        for(int i = 0; i < answer.length; i++) {
            answer[i] = answer[i] * 2;
        }
        return answer;
    }
}

package 코딩테스트연습.level0;

public class _7의개수 {
    public int solution(int[] array) {
        int answer = 0;
        for(int i = 0; i < array.length; i++) {
            for(; array[i] > 0; array[i] /= 10) {
                if(array[i] % 10 == 7) {
                    answer++;
                }
            }
        }
        return answer;
    }
}

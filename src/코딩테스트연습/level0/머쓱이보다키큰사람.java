package 코딩테스트연습.level0;

public class 머쓱이보다키큰사람 {
    public int solution(int[] array, int height) {
        int answer = 0;
        for(int i : array) {
            if(i > height) {
                answer++;
            }
        }
        return answer;
    }
}

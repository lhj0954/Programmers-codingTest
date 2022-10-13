package 코딩테스트연습.level1;

public class 약수의개수와덧셈 {
    public int solution(int left, int right) {
        int answer = 0;

        for(int i = left; i <= right; i++) {
            if(Math.sqrt(i) == (int)Math.sqrt(i)) {
                answer -= i;
            } else {
                answer += i;
            }
        }

        return answer;
    }
}

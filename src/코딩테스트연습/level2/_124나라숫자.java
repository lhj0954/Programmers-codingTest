package 코딩테스트연습.level2;

public class _124나라숫자 {
    public String solution(int n) {
        StringBuilder answer = new StringBuilder();

        for(; n > 0; n /= 3) {
            if(n % 3 == 0) {
                answer.insert(0, 4);
                n--;
            } else {
                answer.insert(0, n % 3);
            }

        }

        return answer.toString();
    }
}

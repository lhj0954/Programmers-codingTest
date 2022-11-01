package 코딩테스트연습.level0;

public class 순서쌍의개수 {
    public int solution(int n) {
        int answer = 0;

        for(int i = 1; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {
                if(i == Math.sqrt(n)) {
                    answer += 1;
                } else {
                    answer += 2;
                }
            }
        }

        return answer;
    }
}
